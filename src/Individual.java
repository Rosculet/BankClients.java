public class Individual extends Account{


    public Individual(String ibahn, double balance) {
        super(ibahn, balance);
    }

    @Override
    public void calculationOfInterest() {
        super.setBalance(super.getBalance() + super.getBalance()* super.getRate()/100);
        sendPost(this);
    }

}
