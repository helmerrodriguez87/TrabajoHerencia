package Herencia;

public class Estudiante extends Persona{

    private String Carrrera;
    private  int Semestre;

    public Estudiante(String nombre, String direccion, String Carrera, int Semestre){
        super(nombre, direccion);

        this.Carrrera = Carrera;
        this.Semestre = Semestre;

    }

    public String getCarrrera() {
        return Carrrera;
    }

    public int getSemestre() {
        return Semestre;
    }

    @Override
    public String toString() {
        return super.toString() + " Estudiante: " +
                "Carrrera = " + getCarrrera()+
                " Semestre = " + getSemestre();
    }
}
