package Herencia;

public class Main {
    public static void main(String[] args) {

        Estudiante  estudiante1 = new Estudiante("Helmer", "Zipaquirá", "ISUM", 9);
        Profesor profesor1 = new Profesor("William", "Zipaquirá", "Cundinamarca", "Pofesional");

        System.out.println(estudiante1.toString());
        System.out.println(profesor1.toString());
    }
}