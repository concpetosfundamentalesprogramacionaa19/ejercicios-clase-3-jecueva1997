/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal2;

import paquedatos.Variable;
import paquedatos.VariableDatos;


// import 
/**
 *
 * @author reati
 */
public class Principal {
    public static void main(String[] args) {
    // metodo principal
    
    double resultado;
    resultado = Variable.numero1 + Variable.numero2;
    
    
    System.out.printf("El resultados es: %.1f\n", resultado);
    
    double resultado2;
    resultado2 = Variable.numero1 + VariableDatos.numero3;
    
    System.out.printf("El resultados es: %.1f\n", resultado2);
    
    }
}
