
import java.util.Scanner;

/*
 *  Práctica 2 While  - Contrasenia
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
        Scanner input = new Scanner (System.in);
                                                    //USUARIO -> abc
                                                    //CONTRASENIA -> cba
        String usu = "";
        String contra = "";
        int cont = 1;
        while(((!"abc".equals(usu)) || (!"cba".equals(contra))) && (cont<=3)){
            System.out.print("Ingrese usuario: ");
            usu = input.nextLine();
            System.out.print("Ingrese contraseña: ");
            contra = input.nextLine();
            cont++;
        }
        if(cont == 4){
            System.out.println("*** Acceso denegado. ***");
        }else{
            System.out.println("*** Bienvenido. ***");
        }
    }
    
}
