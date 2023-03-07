package Herencia;

public class Profesor extends Persona{

    private String Departamento;
    private String Categoria;

    public Profesor(String nombre, String direccion, String Departamento, String Categoria){
        super(nombre, direccion);

        this.Departamento = Departamento;
        this.Categoria = Categoria;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public String getCategoria() {
        return Categoria;
    }

    @Override
    public String toString() {
        return super.toString() + " Profesor: " +
                "Departamento = " + getDepartamento()+
                " Categoria = " + getCategoria();
    }
}
