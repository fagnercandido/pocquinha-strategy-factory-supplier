package pocquinha;

public class MainV1 {

    public static void main(String[] args) {
        InformeExecuteV1 informeExecuteV1 = new InformeExecuteV1();
        EnumeradoGigante tipo = EnumeradoGigante.C1;
        EnumeradoGigante tipo2 = EnumeradoGigante.C2;
        System.out.println("Main V1");
        informeExecuteV1.getMeuQueridoSupplier(tipo).get().execute(new Object());
        informeExecuteV1.getMeuQueridoSupplier(tipo2).get().execute(new Object());

        informeExecuteV1.getMeuQueridoSupplier(tipo).get().execute(new Object());
        informeExecuteV1.getMeuQueridoSupplier(tipo2).get().execute(new Object());
    }

}
