package CLASES_PUBLICAS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanificadorTareas {
    private Map<String, List<String>> tareasAsignadas;

    public PlanificadorTareas() {
        tareasAsignadas = new HashMap<>();
    }

    public void asignarTarea(String miembro, String tarea) {
        tareasAsignadas.computeIfAbsent(miembro, k -> new ArrayList<>()).add(tarea);
    }

    public void visualizarTablaTareas() {
        System.out.println("Tabla de tareas asignadas:");
        for (Map.Entry<String, List<String>> entry : tareasAsignadas.entrySet()) {
            String miembro = entry.getKey();
            List<String> tareas = entry.getValue();
            System.out.println("Miembro: " + miembro);
            System.out.println("Tareas:");
            for (String tarea : tareas) {
                System.out.println("- " + tarea);
            }
            System.out.println();
        }
    }

    public int calcularCargaTrabajoOptima() {
        int cargaTotal = 0;
        for (List<String> tareas : tareasAsignadas.values()) {
            cargaTotal += tareas.size();
        }
        return cargaTotal;
    }
}
