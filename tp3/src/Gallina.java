public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("ID: " + idGallina + ", Edad: " + edad + ", Huevos Puestos: " + huevosPuestos);
    }
}