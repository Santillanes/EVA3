
import java.util.Scanner;

/*
 * Práctica 2 While  - Contrasenia
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
        int usu = (int)(Math.random()*14+1);
        System.out.println("Carta del usuario: "+usu);
        int com = (int)(Math.random()*14+1);
        System.out.println("Carta de computadora: "+com);
        String otra;
        System.out.println("Quieres otra carta?");
        otra = input.nextLine();
        
        while(("si".equals(otra)) && usu<=21 && com<=21){
            usu+=((int)(Math.random()*14+1));
            System.out.println("Sumatoria del usuario: "+usu);
            com+=((int)(Math.random()*14+1));
            System.out.println("Sumatoria de computadora: "+com);
            
            if(usu == 21 && com == 21){
                System.out.println("EMPATE.");
                break;
            }else if(usu == 21){
                System.out.println("GANA EL USUARIO.");
                break;
            }else if(com == 21){
                System.out.println("GANA COMPUTADORA.");
                break;
            }else if(usu>21 && com>21){
                System.out.println("AMBOS PIERDEN.");
                break;
            }else if(usu>21){
                System.out.println("GANA COMPUTADORA.");
                break;
            }else if(com>21){
                System.out.println("GANA EL USUARIO.");
                break;
            }else if(usu>com){
                System.out.println("GANA EL USUARIO");
            }else if(com>usu){
                System.out.println("GANA COMPUTADORA");
            }
            System.out.println("Quieres otra carta?");
            otra = input.nextLine();
        }
        
    }
    
}
