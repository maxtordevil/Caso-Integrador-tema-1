package CLASES_PUBLICAS;

public class ComunicadorInterplanetario {

    public int contarVocales(String mensaje) {
        int contador = 0;
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirMensaje(String mensaje) {
        StringBuilder mensajeInvertido = new StringBuilder();
        for (int i = mensaje.length() - 1; i >= 0; i--) {
            mensajeInvertido.append(mensaje.charAt(i));
        }
        return mensajeInvertido.toString();
    }

    public boolean esPalindromo(String mensaje) {
        String mensajeSinEspacios = mensaje.replaceAll("\\s", "").toLowerCase();
        int izquierda = 0;
        int derecha = mensajeSinEspacios.length() - 1;
        while (izquierda < derecha) {
            if (mensajeSinEspacios.charAt(izquierda) != mensajeSinEspacios.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        ComunicadorInterplanetario comunicador = new ComunicadorInterplanetario();
        String mensaje = "HOLA RUBEN ESTO ES U MENSAJE DESDE LA GALAXIA ANDROMEDA";

        // Contar vocales
        int cantidadVocales = comunicador.contarVocales(mensaje);
        System.out.println("Cantidad de vocales: " + cantidadVocales);

        // Invertir mensaje
        String mensajeInvertido = comunicador.invertirMensaje(mensaje);
        System.out.println("Mensaje invertido: " + mensajeInvertido);

        // Verificar si es palíndromo
        boolean esPalindromo = comunicador.esPalindromo(mensaje);
        System.out.println("Es palíndromo: " + esPalindromo);
    }
}
