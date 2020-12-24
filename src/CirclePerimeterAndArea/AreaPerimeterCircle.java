package CirclePerimeterAndArea;

import java.util.Scanner;

public class AreaPerimeterCircle {
    public static void main(String[] args){
        double radio = 0;
        boolean isCharacter;

        System.out.println("This program prints area and perimeter of circle");
        System.out.println("============================================================");

        do {
            System.out.print("Introduce circle radio..: ");
            try{
                Scanner in = new Scanner(System.in);
                radio = in.nextDouble();
                isCharacter = false;
            }catch (Exception e){
                isCharacter = true;
            }
        }while(isCharacter);

        System.out.println("Perimeter is = " + getPerimeter(radio));
        System.out.println("Area is = " + getArea(radio));
    }

    public static double getArea(double radioIncoming){
        return Math.PI * Math.pow(radioIncoming, 2) ;
    }

    public static double getPerimeter(double radioIncoming){
        return 2.0 * Math.PI * radioIncoming ;
    }
}
