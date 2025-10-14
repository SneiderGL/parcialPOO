import java.util.HashMap;
import java.util.Scanner;

public class ConversorMorseATexto {
    public static void convertir(Scanner leer) {
        HashMap<String, Character> morse = new HashMap<>();
        morse.put(".-", 'a'); morse.put("-...", 'b');
        morse.put("-.-.", 'c'); morse.put("-..", 'd');
        morse.put(".", 'e'); morse.put("..-.", 'f');
        morse.put("--.", 'g'); morse.put("....", 'h');
        morse.put("..", 'i'); morse.put(".---", 'j');
        morse.put("-.-", 'k'); morse.put(".-..", 'l');
        morse.put("--", 'm'); morse.put("-.", 'n');
        morse.put("---", 'o'); morse.put(".--.", 'p');
        morse.put("--.-", 'q'); morse.put(".-.", 'r');
        morse.put("...", 's'); morse.put("-", 't');
        morse.put("..-", 'u'); morse.put("...-", 'v');
        morse.put(".--", 'w'); morse.put("-..-", 'x');
        morse.put("-.--", 'y'); morse.put("--..", 'z');
        morse.put(".----", '1'); morse.put("..---", '2');
        morse.put("...--", '3'); morse.put("....-", '4');
        morse.put(".....", '5'); morse.put("-....", '6');
        morse.put("--...", '7'); morse.put("---..", '8');
        morse.put("----.", '9'); morse.put("-----", '0');

        System.out.print("Ingresa el codigo morse a traducir: ");
        String codigo = leer.nextLine();

        String[] palabras = codigo.split("   ");
        String resultado = "";

        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");
            for (String simbolo : letras) {
                if (morse.containsKey(simbolo)) {
                    resultado += morse.get(simbolo);
                }
            }
            resultado += " ";
        }

        System.out.println("\nTexto traducido:");
        System.out.println(resultado.trim());
    }
}
// habian dos formas de hacerlo, con HashMap y con arreglos, se decidio usar la primera opcion