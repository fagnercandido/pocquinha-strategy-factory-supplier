package pocquinha;

import java.util.function.Supplier;

public enum EnumeradoGigante {
    C1(InformeC1::new),
    C2(InformeC2::new),
    C3(InformeC3::new),
    C4(InformeC4::new),
    C5(InformeC5::new),
    C6(InformeC6::new),
    C7(InformeC7::new),
    C8(InformeC8::new),
    C9(InformeC9::new),
    C10(InformeC10::new),
    C11(InformeC10::new);

    private Supplier<Execute> type;

    EnumeradoGigante(Supplier<Execute> type) {
        this.type = type;
    }

    public Supplier<Execute> getType() {
        return this.type;
    }

}
