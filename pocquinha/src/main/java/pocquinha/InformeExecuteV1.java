package pocquinha;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class InformeExecuteV1 {

    private static final Map<EnumeradoGigante, Supplier<Execute>> executeSupplier;

    static {
        final Map<EnumeradoGigante, Supplier<Execute>> xpto = new HashMap<>();
        Arrays.stream(EnumeradoGigante.values()).forEach(tipo -> xpto.put(tipo, tipo.getType()));
        executeSupplier = Collections.unmodifiableMap(xpto);
        System.out.println("Static InformeV1");
    }

    public Supplier<Execute> getMeuQueridoSupplier(EnumeradoGigante tipo) {
        return executeSupplier.get(tipo);
    }

}
