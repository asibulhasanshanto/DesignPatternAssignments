public class WithDrawChain {
    private AbstractAuthorizer authorizer;
    public WithDrawChain() {
        AbstractAuthorizer cashier = new Cashier(0, 10000);
        AbstractAuthorizer manager = new Manager(10000, 50000);
        AbstractAuthorizer seniorOfficer = new SeniorOfficer(50000, 100000);

        cashier.setNextAuthorizer(manager);
        manager.setNextAuthorizer(seniorOfficer);

        this.authorizer = cashier;
    }

    public AbstractAuthorizer getAuthorizerChain()
    {
        return this.authorizer;
    }
}
