import java.util.Random;
import java.util.Scanner;

public class MiniMinecraft {

    public static void jugar(Scanner leer) {
        int xp = 0;
        boolean jugando = true;
        Random rand = new Random();

        while (jugando) {
            System.out.println("\n*** MINI-MINECRAFT ***");
            System.out.println("XP actual: " + xp);
            System.out.println("1. Comer");
            System.out.println("2. Minar");
            System.out.println("3. Pelear");
            System.out.println("4. Vencer al dragon");
            System.out.println("5. Salir del juego");
            System.out.print("Elige una opcion: ");
            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    xp += comer(rand);
                    break;
                case 2:
                    xp += minar(rand);
                    break;
                case 3:
                    xp += pelear(rand);
                    break;
                case 4:
                    if (xp >= 100) {
                        System.out.println("\nTe enfrentas al dragon...");
                        if (rand.nextInt(100) < 65) {
                            System.out.println("Has vencido al dragon. Eres el heroe de Minecraft!");
                            jugando = false;
                        } else {
                            System.out.println("El dragon te derroto. Pierdes 40 XP.");
                            xp -= 40;
                        }
                    } else {
                        System.out.println("No tienes suficiente XP. Necesitas 100 XP para pelear con el dragon.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del mini-juego y borrando progreso...");
                    jugando = false;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
        System.out.println("XP final: " + xp);
    }

    // --- Comer ---
    private static int comer(Random rand) {
        int prob = rand.nextInt(100);
        if (prob < 30) { // carne
            System.out.println("Comiste carne. +6 XP");
            return 6;
        } else if (prob < 80) { // zanahorias
            System.out.println("Comiste zanahorias. +3 XP");
            return 3;
        } else { // hambre
            System.out.println("Te dio hambre. -5 XP");
            return -5;
        }
    }

    // --- Minar ---
    private static int minar(Random rand) {
        int prob = rand.nextInt(100);
        if (prob < 40) { // carbon
            System.out.println("Encontraste carbon. +1 XP");
            return 1;
        } else if (prob < 75) { // hierro
            System.out.println("Encontraste hierro. +6 XP");
            return 6;
        } else if (prob < 90) { // diamante
            System.out.println("Encontraste diamante. +15 XP");
            return 15;
        } else { // lava
            System.out.println("Caíste en lava. -12 XP");
            return -12;
        }
    }

    // --- Pelear ---
    private static int pelear(Random rand) {
        int prob = rand.nextInt(100);
        if (prob < 15) { // creeper explota
            System.out.println("Te exploto un creeper. -10 XP");
            return -10;
        } else if (prob < 25) { // ganaste creeper
            System.out.println("Derrotaste a un creeper. +12 XP");
            return 12;
        } else if (prob < 65) { // zombie te pega
            System.out.println("Te golpeo un zombie. -4 XP");
            return -4;
        } else { // ganaste zombie
            System.out.println("Derrotaste a un zombie. +8 XP");
            return 8;
        }
    }
}
