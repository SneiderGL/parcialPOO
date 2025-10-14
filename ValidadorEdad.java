import java.util.Scanner;

public class ValidadorEdad {

    public static void validar(Scanner leer) {
        System.out.print("Ingresa tu año de nacimiento: ");
        int anioNac = leer.nextInt();
        System.out.print("Ingresa el año actual: ");
        int anioAct = leer.nextInt();

        int edad = anioAct - anioNac;

        if (edad >= 18) {
            System.out.println("Tienes " + edad + " años. Eres mayor de edad.");
        } else {
            System.out.println("Tienes " + edad + " años. Eres menor de edad.");
        }
    }
}
