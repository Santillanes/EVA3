/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Carlos Santillanes Loya - 18550694
 */
public class Main {  //CLASE --> TIPO DE DATO ABSTRACTO

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new Main());
        int x;
        Main miObjeto = new Main();
        System.out.println(miObjeto);
        UnaClase ucObjeto2 = new UnaClase();
        System.out.println(ucObjeto2);
        //
        int iValor = 5;
        incrementa(iValor);
        System.out.println("El valor es: "+iValor);
        //
        valor vObjetoValor = new valor();
        vObjetoValor.iValor = 5;
        incrementa(vObjetoValor);
        System.out.println("El valor 2 es: "+vObjetoValor.iValor);
    }
    public static void incrementa(int iVal){
        iVal++;
    }
    public static void incrementa(valor vValor){
        vValor.iValor++;
    }
}
class UnaClase{
        
}

class valor{
    int iValor;
}