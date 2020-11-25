/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1036;
import static java.lang.Double.NaN;
import java.util.*;
import static jdk.nashorn.internal.objects.Global.Infinity;
/**
 *
 * @author sajid
 */
public class URI1036 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k=new Scanner(System.in);
        double a=k.nextDouble();
        double b=k.nextDouble();
        double c=k.nextDouble();
        if(a<=0){
            System.out.println("Impossivel calcular");
        }
        else if(b<c){
            System.out.println("Impossivel calcular");
        }
        else{
            double R1= (double) ((-b+(Math.sqrt((Math.pow(b,2)-(4.00000*a*c)))))/(2.00000*a));
            double R2= (double) ((-b-(Math.sqrt((Math.pow(b,2)-(4.00000*a*c)))))/(2.00000*a));
            if(R1==NaN&&R2==NaN&&R1==Infinity&&R2==Infinity){
                System.out.println("Impossivel calcular");
            }
            System.out.printf("R1 = "+"%.5f\n",R1);
            System.out.printf("R2 = "+"%.5f\n",R2);
        }
        
    }
    
}
