package Java_practice.OOPS.Quest2;
import java.util.Scanner;

public class Fourthgate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int k=0;
        if ((p&1)==1) {
            p=3*p+1;
        }else{
            p=p/2;
        }
        System.out.println(p);
    }
}
