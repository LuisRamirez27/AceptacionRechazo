/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author LuisRamirez
 */
public class Archivo_dato {
    

    public double [] Leer(int muestra,String origen) throws FileNotFoundException, IOException {
        double m[]=new double[muestra];
        FileReader archivo= new FileReader(origen);
        BufferedReader ram=new BufferedReader(archivo);
        for (int i = 0; i < muestra; i++) {
            m[i]=Double.parseDouble(ram.readLine());
        }
        archivo.close();
        return m;
    }
    
}
