/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author JonathanCoronel
 */
public class Hospital implements Serializable {

    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;

    public Hospital(String nom, int numCamas, double pres, String id) {
        nombre = nom;
        numeroCamas = numCamas;
        presupuesto = pres;
        idHospital = id;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void estableceridHospital(String n) {
        idHospital = n;
    }

    public void establecerNumeroCamas(int n) {
        numeroCamas = n;
    }

    public void establecerPresupuesto(double n) {
        presupuesto = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public String obteneridHospital() {
        return idHospital;
    }

    @Override
    public String toString() {
        String valor = String.format("%s-%d-%.2f-%s\n", nombre,
                numeroCamas,
                presupuesto, idHospital);
        return valor;
    }

}
