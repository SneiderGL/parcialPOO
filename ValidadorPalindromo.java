import java.util.Scanner;

public class ValidadorPalindromo {

    public static void validar(Scanner leer) {
        System.out.print("Ingresa una palabra o frase: ");
        String texto = leer.nextLine();

        texto = texto.toLowerCase().replace(" ", "");

        String invertido = new StringBuilder(texto).reverse().toString();

        if (texto.equals(invertido)) {
            System.out.println("La frase o palabra es un palindromo.");
        } else {
            System.out.println("La frase o palabra no es un palindromo.");
        }
    }
}
