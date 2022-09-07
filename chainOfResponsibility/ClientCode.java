public class ClientCode {
    public static void main(String[] args) {
        AbstractAuthorizer authorizerChain = new WithDrawChain().getAuthorizerChain();
        Account account = new Account("Asibul Hasan",200000);

        authorizerChain.withdRaw(account,8000);
    }
}
