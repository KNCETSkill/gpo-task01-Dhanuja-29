import java.util.Scanner;

public class BrewSizeAdvisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
        if(volume>350){
            System.out.println("Large");
        }else if(volume>200 && volume<350){
            System.out.println("Medium");
        }
        else{
            System.out.println("Small");
        }
        // TODO:
        // Print "Small", "Medium", or "Large"
        // based on the given volume

        sc.close();
    }
}

