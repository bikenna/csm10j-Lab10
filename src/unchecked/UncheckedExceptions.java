/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unchecked;
import java.lang.ArrayIndexOutOfBoundsException;
/**
 *
 * @author brianobioha
 */
public class UncheckedExceptions {
    public static void ThrowIndexOutOfBounds(){
        int[] values = new int[10];
        System.out.print(values[10]);
    }
    public static void CatchIndexOutOfBounds(){
        try{
            int[] values = new int[10];
            System.out.print(values[10]);
        }catch(ArrayIndexOutOfBoundsException ex ){
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
    }
    public static void CatchIndexOutOfBoundsFinally(){
        try{
            int[] values = new int[10];
            System.out.print(values[10]);
        }catch(ArrayIndexOutOfBoundsException ex ){
            System.out.println("Caught ArrayIndexOutOfBounds");
        }
        finally{
            System.out.println("Finally statement executed");
        }
    }
}
