package lab1.modal.junior;

public class CJunior implements Junior{

    private static final String RANG = "Junior C developer";

    @Override
    public void writeCode() {
        System.out.println(RANG + " write code");
    }

    @Override
    public void codeRefactor() {
        System.out.println(RANG + " make refactoring");
    }

    @Override
    public void consultation() {
        System.out.println(RANG + " consults with Middle");
    }

}
