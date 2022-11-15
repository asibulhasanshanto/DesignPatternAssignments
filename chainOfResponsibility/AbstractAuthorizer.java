public abstract class AbstractAuthorizer {

    protected int minLimit;
    protected AbstractAuthorizer nextAuthorizer;

    //set the next authorizer in the chain
    public void setNextAuthorizer(AbstractAuthorizer nextAuthorizer) {
        this.nextAuthorizer = nextAuthorizer;
    }

    public boolean authorize(Account account,int requestedAmount) {
        boolean state = false;
        //check if the user has enough balance
        if(account.getBalance() <= requestedAmount) {
            account.insufficientBalance();
            return false;
        }

        //check if the requested amount is within the limits
        if(this.minLimit <= requestedAmount) {
            state = state || true;
            this.processAuthorization(requestedAmount);
            // pass it to the next authorizer
            if(nextAuthorizer != null) {
                boolean tempstate = nextAuthorizer.authorize(account,requestedAmount);
                state = state ||  tempstate;
            }
        }

        
        return state;
        
    }

    abstract protected void processAuthorization(int requestedAmount);
}
