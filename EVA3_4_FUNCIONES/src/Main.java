/*
 * FUNCIONEs
 */

/**
 *
 * @author Luis Carlos Santillanes Loya - 18550694
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        //PARA USAR LA FUNCIÓN -- > LLAMADA A FUNCIÓN
        
        //OPCION SI EL METODO ES ESTÁTICO
            // imprimeMensaje(" Luis.");
        //OPCION SI EL METODO NO ES ESTÁTICO
            Main mObjeto = new Main();
            mObjeto.imprimeMensaje(" Luis.");
        
            Math.random();
        
    }
    
    // PARADIGMAS DE PROGRAMACIÓN:
    //    PROGRAMACION ESTRUCTURADA
    //    PROGRAMACIÓN MODULAR, ORIENTADA A OBJETOS, ORIENTADA A EVENTOS, LÓGICA, FUNCIONAL
    
    // OOP
    //publico privado protegido default
    
    // Valor de retirbi binbre de la funcion (argumentos)
    // Cuerpo de la funcion
    
    //FUNCIONES --> Regresa un valor
    //PROCEDIMIENTOS --> NO regresa un valor
    
    void imprimeMensaje(String mensaje){
        System.out.print("Hola, "+mensaje);
    }
}
