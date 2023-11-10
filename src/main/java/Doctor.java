// Subclase Doctor que hereda de la superclase Persona
public class Doctor extends Persona {
    private String especialidad;

    // Constructor
    public Doctor(String nombre, int edad, String direccion, String especialidad) {
        super(nombre, edad, direccion);
        this.especialidad = especialidad;
    }

    // Métodos getter y setter el atributo
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método a realizar
    public void realizarDiagnostico() {
        System.out.println("Realizando diagnóstico...");
    }
}