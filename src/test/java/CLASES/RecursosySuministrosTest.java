import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursosSuministrosTest {

    @Test
    public void testCalcularConsumo() {
        RecursosSuministros recursos = new RecursosSuministros();
        int multiplo = 5;  // 5 días, semanas, meses, etc.
        double consumo = recursos.calcularConsumo(multiplo);
        assertEquals(50.0, consumo, 0.01);  // Asumiendo que el consumo es 10 por día
    }


}