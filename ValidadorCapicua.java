import java.util.Scanner;

public class ValidadorCapicua {

    public static void validar(Scanner leer) {
        System.out.print("Ingresa un numero: ");
        int numero = leer.nextInt();
        leer.nextLine();

        String texto = String.valueOf(numero);

        String invertido = new StringBuilder(texto).reverse().toString();

        if (texto.equals(invertido)) {
            System.out.println("\n" + numero + " es un numero capicua.");
        } else {
            System.out.println("\n" + numero + " no es un numero capicua.");
        }
    }
}
