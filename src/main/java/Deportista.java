// Subclase Deportista que hereda de la superclase Persona
public class Deportista extends Persona {
    private String deporte;

    // Constructor
    public Deportista(String nombre, int edad, String direccion, String deporte) {
        super(nombre, edad, direccion);
        this.deporte = deporte;
    }

    // Métodos getter y setter para el nuevo atributo
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Método adicional
    public void corre() {
        System.out.println("Corriendo...");
    }
}