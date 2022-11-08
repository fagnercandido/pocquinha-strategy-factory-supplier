package pocquinha;

public class InformeC1 implements Execute {

    @Override
    public void execute(Object objetinho) {
        System.out.println(this.getClass().getName());
    }


    public InformeC1() {
        System.out.println("Informe C1");
        System.out.println(this);
    }
}
