/*
    *       STACK --> Memoria estática
    *           Variables primitivas
    *           Llamadas a función
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
        System.out.println("Inicia main");
        A();
        System.out.println("Termina main");
    }
    
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }
    public static void C(){
        System.out.println("Inicia C");
        System.out.println("Termina C");
        int a = 1/0;
    }
    
}
