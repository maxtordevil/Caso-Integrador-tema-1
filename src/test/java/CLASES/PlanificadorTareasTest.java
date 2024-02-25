import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlanificadorTareasTest {

    @Test
    public void testAsignarTarea() {
        PlanificadorTareas planificador = new PlanificadorTareas();
        planificador.asignarTarea("Miembro 1", "Recolectar muestras");
        planificador.asignarTarea("Miembro 2", "Calibrar equipos");

        assertEquals(1, planificador.calcularCargaTrabajoOptima("Miembro 1"));
        assertEquals(1, planificador.calcularCargaTrabajoOptima("Miembro 2"));
    }

    @Test
    public void testCalcularCargaTrabajoOptima() {
        PlanificadorTareas planificador = new PlanificadorTareas();
        planificador.asignarTarea("Miembro 1", "Recolectar muestras");
        planificador.asignarTarea("Miembro 1", "Analizar datos");
        planificador.asignarTarea("Miembro 2", "Calibrar equipos");
        planificador.asignarTarea("Miembro 3", "Realizar mantenimiento");

        assertEquals(2, planificador.calcularCargaTrabajoOptima("Miembro 1"));
        assertEquals(1, planificador.calcularCargaTrabajoOptima("Miembro 2"));
        assertEquals(1, planificador.calcularCargaTrabajoOptima("Miembro 3"));
    }
}
