/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmodulbab2;

/**
 *
 * @author havis
 */
public class TugasModulBab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 45;
        int rata_rata= (number1 + number2 + number3)/3;
        System.out.println("number1= "+ number1);
        System.out.println("number2= "+ number2);
        System.out.println("number3= "+ number3);
        System.out.println("rata-rata = "+rata_rata);
        System.out.println("============================");
      
        int nilai1= 10, nilai2= 23, nilai3= 5;
        System.out.println("number1 = " + nilai1);
        System.out.println("number2 = "+ nilai2);
        System.out.println("number3= "+ nilai3);
        if (nilai1> nilai2)
            if (nilai1> nilai3)
                System.out.println("Nilai Terbesar = "+nilai1);
            else System.out.println("Nilai Terbesar = "+nilai3);
        else System.out.println("Nilai Terbesar = " +nilai2);
        // TODO code application logic here
    }
    
}
