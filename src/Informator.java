public interface Informator {

    default void sendMail(Account a){
        System.out.println("(Mail) Your balance now is: " + a.getBalance() + System.lineSeparator());
    };
    default void sendPost(Account a){

        System.out.println("(Letter) Your balance now is: " + a.getBalance());
    };
}
