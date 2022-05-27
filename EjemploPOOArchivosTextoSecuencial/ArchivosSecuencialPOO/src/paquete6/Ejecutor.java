/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author JonathanCoronel
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.txt";

        
        Hospital h1 = new Hospital("Vicente Moscozo", 300, 58765.12);
        Hospital h2 = new Hospital("Santa Isabel", 250, 64523.12);
        Hospital h3 = new Hospital("Isidro Ayora", 100, 12000.82);
        Hospital h4 = new Hospital("Manuel Vicente", 450, 165943.82);
        
        
        ArchivoEscritura escritura = new ArchivoEscritura(nombreArchivo);
        escritura.establecerHospital(h1);
        escritura.establecerSalida();
        escritura.establecerHospital(h2);
        escritura.establecerSalida();
        escritura.establecerHospital(h3);
        escritura.establecerSalida();
        escritura.establecerHospital(h4);
        escritura.establecerSalida();

        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
