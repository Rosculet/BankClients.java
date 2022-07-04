abstract public class Account implements Informator{

    protected int rate;
    protected String IBAN;
    protected double balance;

    public Account(String ibahn, double balance) {
        this.IBAN = ibahn;
        this.balance = balance;
    }

    public Account(String IBAN, double balance, int rate) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.rate = rate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "IBAN: " + IBAN + " | Balance: " + getBalance() + " | Interest rate: " + getRate() + "%";
    }

    abstract void calculationOfInterest();
}
