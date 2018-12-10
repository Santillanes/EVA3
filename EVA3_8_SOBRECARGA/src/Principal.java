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
        
        System.out.println("Hola");
        System.out.println(7);
        System.out.println(true);
        System.out.println(new Principal()); //Objeto
        
        System.out.println(suma(5,8));
        System.out.println(suma("Hola ", "Mundo!"));
    }
    
    public static int suma(int a, int b){
        return a+b;
    }
    
    public static String suma(String sCade1, String sCade2){
        return sCade1+sCade2;
    }
    
    public static void suma(int iVal){
        
    }
    
}
