public abstract class AbstractAuthorizer {

    protected int minLimit, maxLimit,requestedAmount;
    protected AbstractAuthorizer nextAuthorizer;

    public AbstractAuthorizer(int minLimit, int maxLimit) {
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }

    //set the next authorizer in the chain
    public void setNextAuthorizer(AbstractAuthorizer nextAuthorizer) {
        this.nextAuthorizer = nextAuthorizer;
    }

    public void withdrawRequest(Account account,int requestedAmount) {
        
        if(account.getBalance()<requestedAmount){
            this.rejectRequest();
        }
        else if(requestedAmount >= minLimit && requestedAmount <= maxLimit) {
            System.out.println("Autherizing by " + this.getClass().getSimpleName());
            //forward the request to the next authorizer in the chain
            this.forwardRequest(account,requestedAmount);
            this.authSuccess();
        }else if(requestedAmount>maxLimit){
            this.forwardRequest(account,requestedAmount);
        }

    }

    //forward the message to next authorizer
    protected void forwardRequest(Account account,int requestedAmount) {
        if(nextAuthorizer != null) {
            System.out.println("Forwarding request to " + nextAuthorizer.getClass().getSimpleName());
            nextAuthorizer.withdrawRequest(account,requestedAmount);
        }
    }
    protected boolean rejectRequest() {
        System.out.println("Request rejected by " + this.getClass().getSimpleName()+"due to insufficient balance");
        return false;
    }

   protected boolean authSuccess(){
        System.out.println("authorized by "+this.getClass().getSimpleName());
        return true;
   }
}
