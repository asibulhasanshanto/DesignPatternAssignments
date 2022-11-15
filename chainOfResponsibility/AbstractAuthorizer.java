public abstract class AbstractAuthorizer {

    protected int minLimit;
    protected AbstractAuthorizer nextAuthorizer;

    //set the next authorizer in the chain
    public void setNextAuthorizer(AbstractAuthorizer nextAuthorizer) {
        this.nextAuthorizer = nextAuthorizer;
    }

    public void authorize(Account account,int requestedAmount) {
        if(this.minLimit <= requestedAmount) {
            this.withdraw(account,requestedAmount);
        }
        if(nextAuthorizer != null) {
            nextAuthorizer.authorize(account,requestedAmount);
        }

    }

    abstract protected void withdraw(Account account,int requestedAmount);
}
