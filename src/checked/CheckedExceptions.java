/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checked;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author brianobioha
 */
public class CheckedExceptions {
    public static void OpenFileChecked() throws FileNotFoundException, IOException{
        try{
            FileReader read = new FileReader("nofile.txt");
            read.close();
        }catch(IOException ex){
            throw ex;
        }
    }
}
