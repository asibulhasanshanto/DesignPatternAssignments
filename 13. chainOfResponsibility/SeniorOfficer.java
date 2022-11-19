public class SeniorOfficer extends AbstractAuthorizer {
    public SeniorOfficer(int minLimit) {
        this.minLimit = minLimit;
    }

    @Override
    protected void processAuthorization( int requestedAmount) {
        System.out.println("The amount " + requestedAmount + " is authorized by the SeniorOfficer");
    }
}
    