import java.util.Scanner;

public class ValidadorPerfecto {

    public static void validar(Scanner leer) {
        System.out.print("Ingresa un numero: ");
        int numero = leer.nextInt();

        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        if (suma == numero) {
            System.out.println("El numero " + numero + " es perfecto.");
        } else {
            System.out.println("El numero " + numero + " no es perfecto.");
        }
    }
}
