package lab1.modal.middle;

public class JavaMiddle implements  Middle{
    private static final String RANG = "Middle Java developer";

    @Override
    public void resolveException() {
        System.out.println(RANG + " resolve exceptions");
    }

    @Override
    public void createPlan() {
        System.out.println(RANG + " create plans");
    }

    @Override
    public void helpJunior() {
        System.out.println(RANG + " helping junior developer");
    }
}
