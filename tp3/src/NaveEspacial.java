public class NaveEspacial {
    private String nombre;
    private int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar esa distancia.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
            System.out.println("Se ha recargado " + cantidad + " unidades de combustible.");
        } else {
            System.out.println("No se puede sobrecargar combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + ", Combustible: " + combustible);
    }
}
