import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Zodiaco");
            System.out.println("2. Mayoría de edad");
            System.out.println("3. Número perfecto");
            System.out.println("4. Palíndromo");
            System.out.println("5. Capicúa");
            System.out.println("6. Texto a Morse");
            System.out.println("7. Morse a Texto");
            System.out.println("8. Gestor de Caballeros del Zodiaco");
            System.out.println("9. Juego libre");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = leer.nextInt();
            leer.nextLine(); // Limpia el salto de línea

            switch (opcion) {
                case 1:
                    Zodiaco.calcularSigno(leer);
                    break;
                case 2:
                    ValidadorEdad.validar(leer);
                    break;
                case 3:
                    System.out.println("→ Número perfecto (aún no implementado)");
                    break;
                case 4:
                    System.out.println("→ Palíndromo (aún no implementado)");
                    break;
                case 5:
                    System.out.println("→ Capicúa (aún no implementado)");
                    break;
                case 6:
                    System.out.println("→ Texto a Morse (aún no implementado)");
                    break;
                case 7:
                    System.out.println("→ Morse a Texto (aún no implementado)");
                    break;
                case 8:
                    System.out.println("→ Gestor de Caballeros (aún no implementado)");
                    break;
                case 9:
                    System.out.println("→ Juego libre (aún no implementado)");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 0);

        leer.close();
    }
}
