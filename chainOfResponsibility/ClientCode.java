public class ClientCode {
    public static void main(String[] args) {
        AbstractAuthorizer authorizerChain = new WithDrawChain().getAuthorizerChain();
        Account account = new Account("Asibul Hasan");

        authorizerChain.authorize(account,500000);
    }
}
