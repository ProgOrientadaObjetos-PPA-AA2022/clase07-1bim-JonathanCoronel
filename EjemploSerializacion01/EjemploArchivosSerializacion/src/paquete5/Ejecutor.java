/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALAI
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.data";

        Hospital h1 = new Hospital("Vicente Moscozo", 300, 58765.12);
        Hospital h2 = new Hospital("Santa Isabel", 250, 64523.12);
        Hospital h3 = new Hospital("Isidro Ayora", 100, 12000.82);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.estableceHospitales();
        System.out.println(lectura);

    }
}
