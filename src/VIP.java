public class VIP extends Account{

    double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public VIP(String ibahn, double balance) {
        super(ibahn, balance);
    }

    @Override
    void calculationOfInterest() {
        super.setBalance(super.getBalance() + super.getBalance() * super.getRate()/100 + this.getBonus());
        sendPost(this);
        sendMail(this);

    }
}
