package Herencia;

public class Coche extends Vehiculo{

    private String Categoria;
    private String Matricula;

    public Coche(String marca, String color, int ruedas, String Categoria, String Matricula){
        super(marca, color, ruedas);

        this.Categoria = Categoria;
        this.Matricula = Matricula;
    }

    public String getCategoria() {
        return Categoria;
    }

    public String getMatricula() {
        return Matricula;
    }

    @Override
    public String toString() {
        return super.toString() + " Coche: " +
                " Categoria = " + getCategoria() +
                " Matricula = " + getMatricula() ;
    }
}
