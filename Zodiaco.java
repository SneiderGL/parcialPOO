import java.util.Scanner;

public class Zodiaco {

    public static void calcularSigno(Scanner leer) {

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

        String signo = "";
        String caballero = "";

        if ((mesNac == 3 && diaNac >= 21) || (mesNac == 4 && diaNac <= 19)) {
            signo = "Aries"; caballero = "Mu de Aries";
        } else if ((mesNac == 4 && diaNac >= 20) || (mesNac == 5 && diaNac <= 20)) {
            signo = "Tauro"; caballero = "Aldebaran de Tauro";
        } else if ((mesNac == 5 && diaNac >= 21) || (mesNac == 6 && diaNac <= 20)) {
            signo = "Geminis"; caballero = "Saga de Geminis";
        } else if ((mesNac == 6 && diaNac >= 21) || (mesNac == 7 && diaNac <= 22)) {
            signo = "Cancer"; caballero = "Deathmask de Cancer";
        } else if ((mesNac == 7 && diaNac >= 23) || (mesNac == 8 && diaNac <= 22)) {
            signo = "Leo"; caballero = "Aioria de Leo";
        } else if ((mesNac == 8 && diaNac >= 23) || (mesNac == 9 && diaNac <= 22)) {
            signo = "Virgo"; caballero = "Shaka de Virgo";
        } else if ((mesNac == 9 && diaNac >= 23) || (mesNac == 10 && diaNac <= 22)) {
            signo = "Libra"; caballero = "Dohko de Libra";
        } else if ((mesNac == 10 && diaNac >= 23) || (mesNac == 11 && diaNac <= 21)) {
            signo = "Escorpio"; caballero = "Milo de Escorpio";
        } else if ((mesNac == 11 && diaNac >= 22) || (mesNac == 12 && diaNac <= 21)) {
            signo = "Sagitario"; caballero = "Aioros de Sagitario";
        } else if ((mesNac == 12 && diaNac >= 22) || (mesNac == 1 && diaNac <= 19)) {
            signo = "Capricornio"; caballero = "Shura de Capricornio";
        } else if ((mesNac == 1 && diaNac >= 20) || (mesNac == 2 && diaNac <= 18)) {
            signo = "Acuario"; caballero = "Camus de Acuario";
        } else if ((mesNac == 2 && diaNac >= 19) || (mesNac == 3 && diaNac <= 20)) {
            signo = "Piscis"; caballero = "Afrodita de Piscis";
        }

        System.out.println("\nTienes " + edad + " años y eres " + signo +
                           ", por ende tu caballero del zodiaco es " + caballero + ".");
    }
}
