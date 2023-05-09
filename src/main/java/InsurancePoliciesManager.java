import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Objects;

public class InsurancePoliciesManager {

    File policiesJson;

    public InsurancePoliciesManager(String fileName) {
        String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource(fileName)).getFile();
        policiesJson = new File(file);
    }

    public void displayPolicies() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<InsurancePolicyJson> policies = mapper.readValue(policiesJson, new TypeReference<>() {
        });

        var policiesDecoded = policies.stream()
                .map(policy -> {
                    try {
                        return new InsurancePolicy(policy);
                    } catch (JsonProcessingException | ParseException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toList();

        policiesDecoded
                .forEach(System.out::println);

    }

}
