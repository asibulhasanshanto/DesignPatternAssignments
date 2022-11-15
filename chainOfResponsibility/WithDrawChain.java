public class WithDrawChain {
    private AbstractAuthorizer authorizer;
    public WithDrawChain() {
        AbstractAuthorizer cashier = new Cashier(0);
        AbstractAuthorizer manager = new Manager(10000);
        AbstractAuthorizer seniorOfficer = new SeniorOfficer(1000000);

        cashier.setNextAuthorizer(manager);
        manager.setNextAuthorizer(seniorOfficer);

        this.authorizer = cashier;
    }

    public AbstractAuthorizer getAuthorizerChain()
    {
        return this.authorizer;
    }
}
