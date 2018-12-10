
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlo Santillanes Loya - 18550694
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("==================== PRACTICA 1 ====================");
        System.out.print("Ingrese un número de mes: ");
        int n = input.nextInt(); 
        input.nextLine();
        String sMes = saberMes(n);
        System.out.println("El mes es: "+sMes);
        System.out.println();
        System.out.println("==================== PRACTICA 2 ====================");
        System.out.print("Ingrese una letra de calificación:");
        String Calif = input.nextLine();
        int cal = califas(Calif);
        System.out.println("La calificación es: "+cal);
        System.out.println("");
        System.out.println("==================== PRACTICA 3 ===================");
        System.out.print("Ingrese una calificación: ");
        int cali = input.nextInt();
        String ca = Califas(cali);
        System.out.println("La calificación es: "+ca);
        System.out.println("");
        System.out.println("==================== PRACTICA 4 ===================");
        int califi = Practica4("Introduce tu calificación: ", 1);
        System.out.println("Tu calificación es: "+califi);
        System.out.println("");
        double es = Practica4("Introduce tu estatura en metros: ", 2.5);
        System.out.println("Tu estatura es: "+es+" metros.");
        System.out.println("");
        String texto = Practica4("Introduce un mensaje: ", "a");
        System.out.println("Tu mensaje es: "+texto);
        System.out.println("");
        boolean bool = Practica4("Eres mayor de edad?", true);
        System.out.println("Tu respuesta es: "+bool);
        System.out.println("");
        System.out.println("==================== PRACTICA 5 ===================");
        System.out.print("Ingrese un número: ");
        int nume = input.nextInt();
        System.out.println("Es Primo? ->"+Practica5(nume));
        System.out.println("");
        System.out.println("==================== PRACTICA 6 ===================");
        System.out.print("Introduce un año: ");
        int annio = input.nextInt();
        System.out.println(Practica6(annio));
        System.out.println("");
        System.out.println("==================== PRACTICA 7 ===================");
        System.out.print("Ingrese un valor: ");
        int val = input.nextInt();
        System.out.print("Ingrese una potencia: ");
        int pot = input.nextInt();
        System.out.println("El valor elevado a esa potencia es: "+Practica7(val,pot));
        System.out.println("");
        
    }
    
    public static String saberMes (int mes){
        String nombre;
        switch(mes){
            case 1:
                nombre = "Enero.";
                break;
            case 2:
                nombre = "Febrero.";
                break;
            case 3:
                nombre = "Marzo.";
                break;
            case 4:
                nombre = "Abril.";
                break;
            case 5:
                nombre = "Mayo.";
                break;
            case 6:
                nombre = "Junio.";
                break;
            case 7:
                nombre = "Julio.";
                break;
            case 8:
                nombre = "Agosto.";
                break;
            case 9:
                nombre = "Septiembre.";
                break;
            case 10:
                nombre = "Octubre";
                break;
            case 11:
                nombre = "Noviembre.";
                break;
            case 12:
                nombre = "Diciembre.";
                break;
            default:
                nombre = "*** Número no valido ***";
        }
        return nombre;
    }
    
    public static int califas (String calif){
        int resu = 0;
        switch (calif){
            case "A":
                resu = 100;
                break;
            case "B":
                resu = 90;
                break;
            case "C":
                resu = 80;
                break;
            case "D":
                resu = 70;
                break;
            case "E":
                resu = 60;
                break;
            case "F":
                resu = 50;
                break;
            default:
                System.out.println("*** Letra no válida ***");
        }
        return resu;
    }
    
    public static String Califas (int calif){
        String resu = "";
        switch (calif){
            case 100:
                resu = "A";
                break;
            case 90:
                resu = "B";
                break;
            case 80:
                resu = "C";
                break;
            case 70:
                resu = "D";
                break;
            case 60:
                resu = "E";
                break;
            case 50:
                resu = "F";
                break;
            default:
                System.out.println("*** Calificación no válida ***");
        }
        return resu;        
    }
    
    public static int Practica4(String texto, int a){
        Scanner input = new Scanner(System.in);
        System.out.println(texto);
        int cal = input.nextInt();
        return cal;
    }
    public static double Practica4(String texto, double b){
        Scanner input = new Scanner(System.in);
        System.out.println(texto);
        double est = input.nextDouble();
        return est;
    }
    public static String Practica4(String texto, String c){
        Scanner input = new Scanner(System.in);
        System.out.println(texto);
        String tex = input.nextLine();
        return tex;
    }
    public static boolean Practica4(String texto, boolean d){
        Scanner input = new Scanner(System.in);
        System.out.println(texto);
        boolean bol = input.nextBoolean();
        return bol;
    }
    
    public static boolean Practica5(int a){
        boolean primo = false;
        int cont = 0;
        for (int i = a; i > 0; i--) {
            if(a%i==0)
                cont++;
        }
        if(cont == 2)
            primo = true;
        return primo;
    }
    
    public static String Practica6(int annio){
        int resi4 = annio%4;
        int resi100 = annio%100;
        int resi400 = annio%400;
        String bisi;
        if(((resi4==0)&&!(resi100==0)) || (resi400 == 0)){
            bisi = "Año bisiesto.";
        }else{
            bisi = "Año NO bisiesto.";
        }
        return bisi;
    }
    
    public static int Practica7(int val, int pot){
        int ac = 1;
        for (int i = 0; i < pot; i++) {
            ac*= val;
        }
        return ac;
    }
    
}
