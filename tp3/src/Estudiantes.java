public class Estudiantes {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiantes(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println(apellido + " " + nombre + ", Curso: " + curso + ", Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos <= 10) {
            calificacion += puntos;
            if (calificacion > 100) calificacion = 100;
        }
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
    }
}