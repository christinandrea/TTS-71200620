package com.rplbo.tocm;

public class Main_71200620 {


    public static double FeetInchToCm(int inch){
        if(!(inch<=0)){
            FeetInchToCm(inch/12,inch%12);
            System.out.println(inch + "="+ inch/12+ " ft " + inch%12 + " inch");

        }else{
            return -1;
        }
return inch;
   }
   public static double FeetInchToCm(double feet, double inch){
        if(!(feet <=0) && inch<=12){
            inch = inch*2.54;
            feet = (feet*12*2.54)+inch;
            System.out.println("Nilai dalam cm:"+feet+"cm");
            return feet;

        }else{
            return -1;
        }

   }

    public static void main(String[] args) {
        FeetInchToCm(1, 3);
        FeetInchToCm(15);
    }
}
