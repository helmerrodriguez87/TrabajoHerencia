package Herencia;

public class Persona {

    private  String Nombre;
    private  String Direccion;

    public Persona() {
    }

    public Persona(String nombre, String direccion) {
        this.Nombre = nombre;
        this.Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona: " +
                "Nombre = " + getNombre()+
                " Direccion = " + getDireccion();
    }
}
