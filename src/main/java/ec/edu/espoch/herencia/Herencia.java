/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.herencia;

import ec.edu.espoch.herencia.clases.Coordinador;
import ec.edu.espoch.herencia.clases.Estudiante;
import ec.edu.espoch.herencia.clases.Profesor;

/**
 *
 * @author SO-LAB1-PC19
 */
public class Herencia {

    public static void main(String[] args) {
       
        Estudiante jordy=new Estudiante("111", "Jordy", "Segura", "123553254", "H", 19);
        Profesor pedro=new Profesor("1443", "Ingeniero", "Pedro", "Aguilar", "642225454", "H", 35);
        Coordinador paul=new Coordinador("3433223", "Ingeniero", "Coordinador TI", "Paul", "Paguay", "344545543", "H", 40);
        
        System.out.println(jordy.toString());
        System.out.println(pedro.toString());
        System.out.println(paul.toString());
    }
}
