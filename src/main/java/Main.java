import java.io.IOException;
import java.text.ParseException;

public class Main {

//TODO handle ParseException

    public static void main(String[] args) throws IOException {
        InsurancePoliciesManager insurancePoliciesManager = new InsurancePoliciesManager("input-file.json");
        insurancePoliciesManager.displayPolicies();
    }
}
