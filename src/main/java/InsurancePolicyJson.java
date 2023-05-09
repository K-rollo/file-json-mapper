import java.text.SimpleDateFormat;

public class InsurancePolicyJson {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");


    private String type;
    private String description;
    private String insuranceCompany;
    private String insuranceType;
    private String startTime;
    private int durationInYears;

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public String getStartTime() {
        return startTime;
    }


    public int getDurationInYears() {
        return durationInYears;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", insuranceCompany='" + insuranceCompany + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", startTime='" + startTime + '\'' +
                ", durationInYears=" + durationInYears +
                '}';
    }
}
