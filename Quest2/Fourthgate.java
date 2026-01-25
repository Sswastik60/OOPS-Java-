package Java_practice.OOPS.Quest2;
import java.util.Scanner;

public class Fourthgate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int k=0;
        while (p!=1) {
            if (p%2==0) {
                p=p/2;
                k++;
                System.out.println(p);
            }
            else if (p%2!=0){
                p=3*p+1;
                k++;
                System.out.println(p);
            }
            else{
                
                System.out.println("Trapped in loop at "+p);
                break;
            }
        }
        System.out.println("Escaped in "+k+" steps");
        sc.close();
    }
}
