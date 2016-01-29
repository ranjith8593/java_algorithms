/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg150coding;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ranjith Ramesh
 */
public class FileReading {
    
    public static void main(String [] args) throws FileNotFoundException, IOException{
        
          FileInputStream fis = new FileInputStream("");

    BufferedReader reader = new BufferedReader( new InputStreamReader( new DataInputStream(fis)));

   
    String line;

    while(  (line = reader.readLine()) != null){

        System.out.print(line);
    }
    
}
}
