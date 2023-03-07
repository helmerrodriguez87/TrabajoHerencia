package Herencia;

public class Bicicleta extends Vehiculo{

    private String Tipo;

    private boolean ecologica;

    public Bicicleta (String marca, String color, int ruedas, String Tipo, boolean ecologica){
        super(marca, color, ruedas);

        this.Tipo = Tipo;
        this.ecologica = ecologica;
    }

    public String getTipo() {
        return Tipo;
    }

    public boolean isEcologica() {
        return ecologica;
    }

    @Override
    public String toString() {
        return super.toString() + " Bicicleta: " +
                " Tipo = " + getTipo() +
                " Ecologica = " + isEcologica();
    }
}
