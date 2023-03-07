package Herencia;

public class Vehiculo {

    private String Marca;
    private String Color;
    private int Ruedas;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String color, int ruedas) {
        this.Marca = marca;
        this.Color = color;
        this.Ruedas = ruedas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int ruedas) {
        Ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Vehiculo: " +
                " Marca = " + Marca +
                " Color = " + Color +
                " Ruedas = " + Ruedas;
    }
}
