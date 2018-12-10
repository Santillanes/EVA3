/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Santillanes Loya - 18550694
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        miStackOverFlow();
        
    }
                // RECURSIVIDAD - NOS ACABAMOS LA MEMORIA (STACK OVERFLOW (DESBORDE EN EL STACK) )
    public static void miStackOverFlow(){
        System.out.println("Hola usuario, bonito día!!!");
        miStackOverFlow();
    }
    
}
