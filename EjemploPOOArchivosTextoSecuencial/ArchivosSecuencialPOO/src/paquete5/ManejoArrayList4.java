/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {
        Empresa emp1 = new Empresa("Nintendo", "Los Angeles");
        Empresa emp2 = new Empresa("Windowns", "Loja");
        Empresa emp3 = new Empresa("Facebook", "Quito");
        Empresa emp4 = new Empresa("Sansug", "Zamora");

        // ArrayList
        ArrayList<Empresa> empresas = new ArrayList<>();
        empresas.add(emp1);
        empresas.add(emp2);
        empresas.add(emp3);
        empresas.add(emp4);

        for (int i = 0; i < empresas.size(); i++) {
            System.out.printf("%s - %s\n",
                    empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad());
        }
        System.out.println("-----------------------------");

    }
}
