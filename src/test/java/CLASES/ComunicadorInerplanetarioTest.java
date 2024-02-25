package TESTS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ComunicadorInterplanetarioTest {

    @Test
    public void testContarVocales() {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        assertEquals(11, comunicador.contarVocales("HOLA RUBEN ESTO ES UN MENSAJE DESDE LA GALAXIA ANDROMEDA"));
        assertEquals(1, comunicador.contarVocales("A"));
        assertEquals(0, comunicador.contarVocales("BCD"));
    }

    @Test
    public void testInvertirMensaje() {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        assertEquals("ADEMORDNA AIXALAG ED DESAJNEM NU SE OTSE ONEW RUBEN ALOH", comunicador.invertirMensaje("HOLA RUBEN ESTO ES UN MENSAJE DESDE LA GALAXIA ANDROMEDA"));
        assertEquals("A", comunicador.invertirMensaje("A"));
        assertEquals("DCBA", comunicador.invertirMensaje("ABCD"));
    }

    @Test
    public void testEsPalindromo() {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        assertTrue(comunicador.esPalindromo("anita lava la tina"));
        assertTrue(comunicador.esPalindromo("A man a plan a canal Panama"));
        assertFalse(comunicador.esPalindromo("hello"));
    }
}

    }
}