import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n ***MENU PRINCIPAL*** ");
            System.out.println("1. Zodiaco por fecha de nacimiento");
            System.out.println("2. Validador de mayoria de edad");
            System.out.println("3. Validador de numero perfecto");
            System.out.println("4. Validador de palindromo");
            System.out.println("5. Validador de capicua");
            System.out.println("6. Conversor texto a morse");
            System.out.println("7. Conversor morse a texto");
            System.out.println("8. Gestor de caballeros del zodiaco");
            System.out.println("9. Juego libre");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    Zodiaco.calcularSigno(leer);
                    break;
                case 2:
                    ValidadorEdad.validar(leer);
                    break;
                case 3:
                    ValidadorPerfecto.validar(leer);
                    break;
                case 4:
                    ValidadorPalindromo.validar(leer);
                    break;
                case 5:
                    ValidadorCapicua.validar(leer);
                    break;
                case 6:
                    ConversorTextoAMorse.convertir(leer);
                    break;
                case 7:
                    ConversorMorseATexto.convertir(leer);
                    break;

                    
                case 8:
                   
    GestorCaballero gestor = new GestorCaballero();
    int opc;
    do {
        System.out.println("\n--- GESTOR DE CABALLEROS ---");
        System.out.println("1. Crear caballero");
        System.out.println("2. Mostrar caballeros");
        System.out.println("3. Eliminar caballero");
        System.out.println("4. Batalla de caballeros");
        System.out.println("0. Volver al menú principal");
        System.out.print("Elige una opción: ");
        opc = leer.nextInt();
        leer.nextLine();

        switch (opc) {
            case 1: gestor.crearCaballero(leer); break;
            case 2: gestor.mostrarCaballeros(); break;
            case 3: gestor.eliminarCaballero(leer); break;
            case 4: gestor.batalla(leer); break;
            case 0: System.out.println("Volviendo al menú principal..."); break;
            default: System.out.println("Opción inválida.");
        }
    } while(opc != 0);
                    break;


                case 9:
                    System.out.println("Juego libre (proximamente)");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no disponible, intenta de nuevo");
            }
        } while (opcion != 0);

        leer.close();
    }
}
