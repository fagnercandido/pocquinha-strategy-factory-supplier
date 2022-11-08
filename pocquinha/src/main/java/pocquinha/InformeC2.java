package pocquinha;

/**
 * The type Informe c 2.
 */
public class InformeC2 implements Execute {

    public InformeC2() {
        System.out.println("Informe C2");
        System.out.println(this);
    }

    @Override
    public void execute(Object objetinho) {
        System.out.println(this.getClass().getName());
    }
}
