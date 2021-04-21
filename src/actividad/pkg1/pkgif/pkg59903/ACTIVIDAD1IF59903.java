/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1.pkgif.pkg59903;
import java.util.Scanner;
/**
 *
 * @author Adrian Quej
 */
public class ACTIVIDAD1IF59903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año;
        int otroAño;
        int diferencia;
        Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe el año actual : ");
        año = miConsola.nextInt();
       
       System.out.println("Escribe un año cualquiera : ");
        otroAño = miConsola.nextInt();
        
        if (año > otroAño){
            diferencia = año - otroAño;
            System.out.println("Han pasado " + diferencia + "años");
        } else {
            diferencia = otroAño - año;
            System.out.println("Faltan " +diferencia + " años");
            }
        
        
    }
    
}
