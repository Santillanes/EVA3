/*
 *  Práctica 3 While  - Número Primo
 */
package eva3_practica_while_3;

import java.util.Scanner;

/**
 *
 * @author Luis Carlos Santillanes Loya - 18550694
 */
public class EVA3_PRACTICA_WHILE_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        int n = input.nextInt();
        int i = n;
        int cont = 0;
        while(i>0){
            if(n%i==0){
                cont++;
            }
            i--;
        }
        if(cont == 2){
            System.out.println("Número primo.");
        }else{
            System.out.println("Número NO primo.");
        }
    }
    
}
