public class ClientCode {
    public static void main(String[] args) {
        boolean isAuthorized;
        AbstractAuthorizer authorizerChain = new WithDrawChain().getAuthorizerChain();
        Account account = new Account("Asibul Hasan", 10000000);

        Integer amount = 1000000;
        isAuthorized = authorizerChain.authorize(account,amount);
        if(isAuthorized) {
            account.withdraw(amount);
        }
        else {
            System.out.println("Withdrawal failed");
        }
    }
}
