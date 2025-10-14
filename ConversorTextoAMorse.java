import java.util.HashMap;
import java.util.Scanner;

public class ConversorTextoAMorse {
    public static void convertir(Scanner leer) {
        HashMap<Character, String> morse = new HashMap<>();
        morse.put('a', ".-"); morse.put('b', "-...");
        morse.put('c', "-.-."); morse.put('d', "-..");
        morse.put('e', "."); morse.put('f', "..-.");
        morse.put('g', "--."); morse.put('h', "....");
        morse.put('i', ".."); morse.put('j', ".---");
        morse.put('k', "-.-"); morse.put('l', ".-..");
        morse.put('m', "--"); morse.put('n', "-.");
        morse.put('o', "---"); morse.put('p', ".--.");
        morse.put('q', "--.-"); morse.put('r', ".-.");
        morse.put('s', "..."); morse.put('t', "-");
        morse.put('u', "..-"); morse.put('v', "...-");
        morse.put('w', ".--"); morse.put('x', "-..-");
        morse.put('y', "-.--"); morse.put('z', "--..");
        morse.put('1', ".----"); morse.put('2', "..---");
        morse.put('3', "...--"); morse.put('4', "....-");
        morse.put('5', "....."); morse.put('6', "-....");
        morse.put('7', "--..."); morse.put('8', "---..");
        morse.put('9', "----."); morse.put('0', "-----");

        System.out.print("Ingresa el texto que deseas convertir a morse: ");
        String texto = leer.nextLine().toLowerCase();

        String resultado = "";
        for (char letra : texto.toCharArray()) {
            if (letra == ' ') {
                resultado += "   ";
            } else if (morse.containsKey(letra)) {
                resultado += morse.get(letra) + " ";
            }
        }

        System.out.println("\nTexto en morse:");
        System.out.println(resultado);
    }
}
// habian dos formas de hacerlo, con HashMap y con arreglos, se decidio usar la primera opcion