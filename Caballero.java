public class Caballero {
    private String nombre;
    private String tipo; // ORO, PLATA, BRONCE
    private int cosmos;  // 1 a 100
    private int ataqueBase;
    private int defensaBase;

    public Caballero(String nombre, String tipo, int cosmos) {
        this.nombre = nombre;
        this.tipo = tipo.toUpperCase();
        if(cosmos < 1) cosmos = 1;
        if(cosmos > 100) cosmos = 100;
        this.cosmos = cosmos;

        switch (this.tipo) {
            case "ORO":
                ataqueBase = 7;
                defensaBase = 7;
                break;
            case "PLATA":
                ataqueBase = 5;
                defensaBase = 5;
                break;
            default: // BRONCE
                ataqueBase = 3;
                defensaBase = 3;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataqueBase * cosmos;
    }

    public int getDefensa() {
        return defensaBase * cosmos;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCosmos() {
        return cosmos;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") - Cosmos: " + cosmos + 
               " | Ataque: " + getAtaque() + " | Defensa: " + getDefensa();
    }
}
