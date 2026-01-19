import java.io.*;
import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
        
        if((volume>=0) &&(volume<200)){
            System.out.println("Small");
        }
        else if((volume>=200)&&(volume<350)){
            System.out.println("Medium");
        }
        else{
            System.out.println("Large");
        }
        // TODO:
        // Print "Small", "Medium", or "Large"
        // based on the given volume

        sc.close();
    }
}
