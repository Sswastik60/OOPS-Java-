package Java_practice.OOPS.Quest2;
import java.util.Scanner;

public class Secondgate{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seed=sc.nextInt();
        
        int node = 0;
        int powersum=0;
        for (int i = 0; i <= 10; i++) {
            int power = (seed + i*i) %10;
            powersum+=power;
            node++;
            if ((powersum%7)==0) {
                break;
            }
        }
        System.out.println("Nodes activated ="+node);
        System.out.println("Totalpower"+powersum);

        sc.close();
    }
} 

    
