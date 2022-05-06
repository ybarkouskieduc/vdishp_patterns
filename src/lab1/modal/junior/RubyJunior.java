package lab1.modal.junior;

public class RubyJunior implements Junior{
    private static final String RANG = "Junior Ruby developer";

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
