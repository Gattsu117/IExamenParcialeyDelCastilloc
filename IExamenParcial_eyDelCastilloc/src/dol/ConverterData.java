/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

import iexamenparcial_eydelcastilloc.ui.Menu;
import java.util.Scanner;

/**
 *
 * @author JADPA-14
 */
public class ConverterData {
    Scanner scan = new Scanner(System.in);

    public int getOpt() {
        return opt;
    }

    public void setOpt(int opt) {
        this.opt = opt;
    }

    public float getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(float sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public float getSizeKiloBytes() {
        return sizeKiloBytes;
    }

    public void setSizeKiloBytes(float sizeKiloBytes) {
        this.sizeKiloBytes = sizeKiloBytes;
    }

    public float getSizeMegaBytes() {
        return sizeMegaBytes;
    }

    public void setSizeMegaBytes(float sizeMegaBytes) {
        this.sizeMegaBytes = sizeMegaBytes;
    }

    public ConverterData(int opt, float sizeBytes, float sizeKiloBytes, float sizeMegaBytes) {
        this.opt = opt;
        this.sizeBytes = sizeBytes;
        this.sizeKiloBytes = sizeKiloBytes;
        this.sizeMegaBytes = sizeMegaBytes;
    }
    private int opt;
    private float sizeBytes;
    private float sizeKiloBytes;
    private float sizeMegaBytes;

   
     public void converter(int num1) {
         float bytes = 8;
          Menu menu = new Menu();
	    	switch(num1){
                    case 1:
                        System.out.println("Bytes a KiloBytes\n");
                       System.out.println("Ingrese la cantidad de Bytes");
                       setSizeBytes(scan.nextFloat());
                       
                        float Bytes = getSizeBytes() * bytes;
                       float kB = Bytes/1000;
                        System.out.println("El tamaño en KB es =" + kB);
                      
                        menu.show();
                        break;
                        case 2:
                        System.out.println("\nKiloBytes a MegaBytes");
                         System.out.println("Ingrese la cantidad de KiloBytes");
                         setSizeKiloBytes(scan.nextFloat());
                        float mb = getSizeKiloBytes() /1024;
                    
                         System.out.println("El tamaño en mb es =" + mb);
                         
                        menu.show();
                        break;
                       
                         
                       
                          default:
                              System.out.println("Opción no valida volviendo al menu");
                         menu.show(); 
                         break;
                         
                        
                }
	    }
}
