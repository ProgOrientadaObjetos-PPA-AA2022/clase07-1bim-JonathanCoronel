/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {

    public static void main(String[] args) {
        Calificacion c1 = new Calificacion(8.5, "Matematica");
        Calificacion c2 = new Calificacion(7.5, "Lengua y Literatura");
        Calificacion c3 = new Calificacion(6.5, "Fisica");

        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Toni Gambino", "facturado");

        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);

        // ArrayList
        ArrayList<Calificacion> calificacion = new ArrayList<>();
        calificacion.add(c1);
        calificacion.add(c2);
        calificacion.add(c3);
        System.out.println("Empresas");
        for (int i = 0; i < calificacion.size(); i++) {
            System.out.printf("%s - %s- %.2f\n",
                    calificacion.get(i).obtenerProfesor().obtenerNombre(),
                    calificacion.get(i).obtenerNombreMateria(),
                    calificacion.get(i).obtenerNota());
        }
        System.out.println("-----------------------------");

    }
}
