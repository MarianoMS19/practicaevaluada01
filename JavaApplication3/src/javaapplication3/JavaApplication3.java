/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String lectura;
        double salario;
        //aqui pide el salario y lo lee
        lectura = JOptionPane.showInputDialog("Digite su salario");
        salario = Integer.parseInt(lectura);
        //declaramos las variables CCSS y Asociacion
        double CCSS;
        double asociacion;
        // sacamos el total que hay de deducciones
        CCSS = (salario * 14.33 / 100);
        // sacamos el total que va para la asociacion con la deduccion ya incluida
        asociacion = ((salario - CCSS) * 2.5 / 100);

        //ponemos un mensaje que diga lo que se le debe dar a la CCSS
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + CCSS + " colones por concepto de \n"
                + "SEM y IVM");
        // un mensaje de cuanto hay que darle a la asociacion
        JOptionPane.showMessageDialog(null, "Para la asociación de la empresa se le asigna un valor " + asociacion + " colones");

    }
}


