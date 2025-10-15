import java.util.ArrayList;
import java.util.Scanner;

public class GestorCaballero {
    private ArrayList<Caballero> lista = new ArrayList<>();

    public void crearCaballero(Scanner leer) {
        System.out.print("Nombre del caballero: ");
        String nombre = leer.nextLine();
        System.out.print("Tipo (ORO, PLATA, BRONCE): ");
        String tipo = leer.nextLine();
        System.out.print("Nivel de cosmos (1-100): ");
        int cosmos = leer.nextInt();
        leer.nextLine();

        if(cosmos < 1 || cosmos > 100) {
            System.out.println("Cosmos inválido, debe estar entre 1 y 100.");
            return;
        }

        lista.add(new Caballero(nombre, tipo, cosmos));
        System.out.println("Caballero creado exitosamente!");
    }

    public void mostrarCaballeros() {
        if(lista.isEmpty()) {
            System.out.println("No hay caballeros creados.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i+1) + ". " + lista.get(i));
        }
    }

    public void eliminarCaballero(Scanner leer) {
        mostrarCaballeros();
        if(lista.isEmpty()) return;

        System.out.print("Número del caballero a eliminar: ");
        int index = leer.nextInt();
        leer.nextLine();

        if(index < 1 || index > lista.size()) {
            System.out.println("Número inválido.");
            return;
        }

        Caballero eliminado = lista.remove(index - 1);
        System.out.println("Se eliminó a " + eliminado.getNombre());
    }

    public void batalla(Scanner leer) {
        mostrarCaballeros();
        if(lista.size() < 2) {
            System.out.println("Necesitas al menos 2 caballeros para batallar.");
            return;
        }

        System.out.print("Número del primer caballero: ");
        int idx1 = leer.nextInt() - 1;
        System.out.print("Número del segundo caballero: ");
        int idx2 = leer.nextInt() - 1;
        leer.nextLine();

        if(idx1 < 0 || idx1 >= lista.size() || idx2 < 0 || idx2 >= lista.size() || idx1 == idx2) {
            System.out.println("Selección inválida.");
            return;
        }

        Caballero c1 = lista.get(idx1);
        Caballero c2 = lista.get(idx2);

        int poder1 = c1.getAtaque() + c1.getDefensa();
        int poder2 = c2.getAtaque() + c2.getDefensa();

        System.out.println(c1.getNombre() + " vs " + c2.getNombre());
        if(poder1 > poder2) System.out.println("Ganador: " + c1.getNombre());
        else if(poder2 > poder1) System.out.println("Ganador: " + c2.getNombre());
        else System.out.println("Empate!");
    }
}
