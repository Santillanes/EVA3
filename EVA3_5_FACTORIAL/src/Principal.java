/*
 *  FACTORIAL
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
        int n = 5;
        int iResu = calculaFactorial(n);
                //OPCIÓN 1 -- MÁS RECOMENDABLE
        System.out.println("El resultado es: "+iResu);
                //OPCIÓN 2
        System.out.println("El resultado es: "+calculaFactorial(n));
        
    }
    
    static int calculaFactorial(int iVal){
        int iFact = 1;
        for (int i = iVal; i >= 1; i--) {
            iFact*=i; //iFact = iFact * i;
        }
        return iFact; //SIEMPRE AL FINAL, INSTRUCCIONES BAJO EL RETURN NO SE LLEVARÁN A CABO
    }
    
}
