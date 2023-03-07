package Herencia;

public class Main {
    public static void main(String[] args) {

        Estudiante  estudiante1 = new Estudiante("Helmer", "Zipaquirá", "ISUM", 9);
        Profesor profesor1 = new Profesor("William", "Zipaquirá", "Cundinamarca", "Pofesional");

        System.out.println(estudiante1.toString());
        System.out.println(profesor1.toString());

        Coche Coche1 = new Coche("Ferrari", "Rojo", 4, "Deportivo", "GHT897");
        Bicicleta bici1 = new Bicicleta("GW", "Azul/Negro", 2, "Montaña", false);

        System.out.println(Coche1.toString());
        System.out.println(bici1.toString());
    }
}