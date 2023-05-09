public class InsuranceCompany {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String emailAddress;


    public InsuranceCompany(String insuranceCompany) {
        this.companyName = insuranceCompany;
    }

    @Override
    public String toString() {
        return companyName;

    }
}
