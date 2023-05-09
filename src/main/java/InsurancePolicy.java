import com.fasterxml.jackson.core.JsonProcessingException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InsurancePolicy {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private ItemType itemType;
    private String description;
    private InsuranceCompany insuranceCompany;
    private String insuranceType;
    private Date startTimeDate;
    private int durationInYears;

    public InsurancePolicy(InsurancePolicyJson insurancePolicyJson) throws JsonProcessingException, ParseException {
        this.itemType = new ItemType(insurancePolicyJson.getType());
        this.description = insurancePolicyJson.getDescription();
        this.insuranceCompany = new InsuranceCompany(insurancePolicyJson.getInsuranceCompany());
        this.insuranceType = insurancePolicyJson.getInsuranceType();
        this.startTimeDate = dateFormat.parse(insurancePolicyJson.getStartTime());
      this.durationInYears = insurancePolicyJson.getDurationInYears();
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                ", itemType=" + itemType +
                ", description='" + description + '\'' +
                ", insuranceCompany=" + insuranceCompany +
                ", insuranceType='" + insuranceType + '\'' +
                ", startTimeDate=" + startTimeDate +
                ", durationInYears=" + durationInYears +
                '}';
    }
}


