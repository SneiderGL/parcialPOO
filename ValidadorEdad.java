import java.util.Scanner;

public class ValidadorEdad {

    public static void validar(Scanner leer) {
        System.out.print("Ingresa tu año de nacimiento: ");
        int anioNac = leer.nextInt();
        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        int mesNac = leer.nextInt();
        System.out.print("Ingresa tu dia de nacimiento: ");
        int diaNac = leer.nextInt();

        System.out.print("Ingresa el año actual: ");
        int anioAct = leer.nextInt();
        System.out.print("Ingresa el mes actual (1-12): ");
        int mesAct = leer.nextInt();
        System.out.print("Ingresa el dia actual: ");
        int diaAct = leer.nextInt();

        int edad = anioAct - anioNac;

        if (mesAct < mesNac || (mesAct == mesNac && diaAct < diaNac)) {
            edad--;
        }

        if (edad >= 18) {
            System.out.println("Tienes " + edad + " años. Eres mayor de edad.");
        } else {
            System.out.println("Tienes " + edad + " años. Eres menor de edad.");
        }
    }
}