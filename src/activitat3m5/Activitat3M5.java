package activitat3m5;

import java.util.Scanner;

public class Activitat3M5 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int nombre;
        double preu;
        System.out.println("En quantes UF's t'has matriculat?");
        nombre = reader.nextInt();
        if(nombre<12){
            preu=nombre*30;
        }else{
            preu=380;
        }
        System.out.println("El preu sera de "+preu);
    }

}
