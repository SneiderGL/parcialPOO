import java.util.Scanner;

public class ValidadorPalindromo {

    public static void validar(Scanner leer) {
        System.out.print("Ingresa una palabra o frase: ");
        String texto = leer.nextLine();

        // Normalizar el texto
        texto = texto.toLowerCase()
                     .replace(" ", "")
                     .replace("á", "a")
                     .replace("é", "e")
                     .replace("í", "i")
                     .replace("ó", "o")
                     .replace("ú", "u");

        // Invertir el texto con StringBuilder
        String invertido = new StringBuilder(texto).reverse().toString();

        // Verificar si es palindromo
        if (texto.equals(invertido)) {
            System.out.println("\n" + texto + " es un palindromo.");
        } else {
            System.out.println("\n" + texto + " no es un palindromo.");
        }
    }
}