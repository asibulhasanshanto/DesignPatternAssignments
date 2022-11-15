public class WithDrawChain {
    private AbstractAuthorizer authorizer;
    public WithDrawChain() {
        AbstractAuthorizer cashier = new Cashier(10000);
        AbstractAuthorizer manager = new Manager(50000);
        AbstractAuthorizer seniorOfficer = new SeniorOfficer(100000);

        cashier.setNextAuthorizer(manager);
        manager.setNextAuthorizer(seniorOfficer);

        this.authorizer = cashier;
    }

    public AbstractAuthorizer getAuthorizerChain()
    {
        return this.authorizer;
    }
}
