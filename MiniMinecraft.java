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
            System.out.println("4. Vencer al dragón");
            System.out.println("5. Salir del juego");
            System.out.print("Elige una opción: ");
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
                        System.out.println("\n¡Te enfrentas al dragón!");
                        if (rand.nextInt(100) < 80) {
                            System.out.println("¡Ganaste! Has vencido al dragón 🐉");
                            jugando = false;
                        } else {
                            System.out.println("¡Perdiste la pelea! Pierdes 35 XP");
                            xp -= 35;
                        }
                    } else {
                        System.out.println("No puedes pelear con el dragón, necesitas 100 XP.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del mini-juego y borrando progreso...");
                    jugando = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        System.out.println("XP final: " + xp);
    }

    private static int comer(Random rand) {
        int prob = rand.nextInt(100);
        if (prob < 20) {
            System.out.println("Comiste carne. +5 XP");
            return 5;
        } else if (prob < 70) {
            System.out.println("Comiste zanahorias. +3 XP");
            return 3;
        } else {
            System.out.println("Te dio hambre. -3 XP");
            return -3;
        }
    }

    private static int minar(Random rand) {
        int prob = rand.nextInt(100);
        if (prob < 40) {
            System.out.println("Encontraste carbón. +0 XP");
            return 0;
        } else if (prob < 60) {
            System.out.println("Encontraste hierro. +5 XP");
            return 5;
        } else if (prob < 70) {
            System.out.println("Encontraste diamante. +20 XP");
            return 20;
        } else {
            System.out.println("Caiste en lava. -15 XP");
            return -15;
        }
    }

    private static int pelear(Random rand) {
        int prob = rand.nextInt(100);
        if (prob < 20) {
            System.out.println("Te explotó un creeper. -7 XP");
            return -7;
        } else if (prob < 30) {
            System.out.println("Ganaste a un creeper. +10 XP");
            return 10;
        } else if (prob < 80) {
            System.out.println("Te pegó un zombie. -2 XP");
            return -2;
        } else {
            System.out.println("Le ganaste a un zombie. +7 XP");
            return 7;
        }
    }
}

