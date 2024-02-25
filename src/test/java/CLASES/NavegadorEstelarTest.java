import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
public class NavegadorEstelarTest {

    @Test
    public void testMultiplicarMatrices() {
        NavegadorEstelar navegador = new NavegadorEstelar();
        int[][] matrizA = {{1, 2}, {3, 4}};
        int[][] matrizB = {{5, 6}, {7, 8}};
        int[][] resultadoEsperado = {{19, 22}, {43, 50}};
        int[][] resultado = navegador.multiplicarMatrices(matrizA, matrizB);
        assertArrayEquals(resultadoEsperado, resultado);
    }
}
