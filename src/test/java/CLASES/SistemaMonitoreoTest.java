import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SistemaMonitoreoTest {

    @Test
    public void testAlerta() {
        SistemaMonitoreo sistema = new SistemaMonitoreo();
        String alerta = sistema.alerta(90, 35, 1000);
        assertEquals("Nivel de radiación alto. Se recomienda tomar medidas de seguridad.\nPresión alta. Reducir la presión gradualmente.\n", alerta);
    }

    @Test
    public void testEventosRaros() {
        SistemaMonitoreo sistema = new SistemaMonitoreo();
        List<Integer> eventos = sistema.eventosRaros(5);
        assertEquals(List.of(2, 3, 5, 7, 11), eventos);
    }
}
