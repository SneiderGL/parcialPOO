public class Caballero {
    private String nombre;
    private int cosmos;
    private int multiplicador; // Poder base según tipo
    private int ataque;
    private int defensa;

    // Constructor
    public Caballero(String nombre, int cosmos, int multiplicador) {
        this.nombre = nombre;
        setCosmos(cosmos); // usa setter para validar el rango
        this.multiplicador = multiplicador;
        calcularStats();
    }

    // Calcula ataque y defensa según cosmos y multiplicador
    private void calcularStats() {
        this.ataque = cosmos * multiplicador;
        this.defensa = cosmos * multiplicador;
    }

    public int atacar() {
        return ataque;
    }

    public int defender() {
        return defensa;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cosmos: " + cosmos);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
    }

    // Getters y setters
    public String getNombre() { return nombre; }

    public int getCosmos() { return cosmos; }

    public void setCosmos(int cosmos) {
        if (cosmos < 1 || cosmos > 100) {
            System.out.println("Cosmos inválido. Debe estar entre 1 y 100. Se ajustará a 1.");
            this.cosmos = 1;
        } else {
            this.cosmos = cosmos;
        }
        calcularStats();
    }
}
