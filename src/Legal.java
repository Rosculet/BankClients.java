public class Legal extends Account{


    public Legal(String ibahn, double balance) {
        super(ibahn, balance);
    }

    @Override
    public void calculationOfInterest() {
       if(super.getBalance() > 10000) {
           super.setBalance(super.getBalance() + super.getBalance() * super.getRate() / 100);
           sendPost(this);
       }
       else {
           System.out.println("Calculation impossible. You need to recharge your balance. Rate setted to 0.");
           super.setRate(0);
       }
    }
}
