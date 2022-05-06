package lab1.modal.senior;

public class RubySenior implements Senior{
    private static final String RANG = "Senior Ruby developer";

    @Override
    public void talkWithBoss() {
        System.out.println(RANG + " talking with boss");
    }

    @Override
    public void talkWithCustomer() {
        System.out.println(RANG + " talking with customer");
    }

    @Override
    public void approvePR() {
        System.out.println(RANG + " approving pull request");
    }

}
