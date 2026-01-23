package Java_practice.OOPS.Quest2;
import java.util.Scanner;
public class Firstgate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the starting number : ");
        int start = sc.nextInt();
        
        System.out.println("Enter the length : ");
        int length = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < length; i++) {
            int count=0;
            int copy = start;
            System.out.println(start+" ");
            while (copy>0) {
                count+=(copy&1);
                copy=copy>>1;
            }
            start+=count;

        }
        sc.close();
    }
}
//Did not know what a set bit is so had to google and found out that it is the no of 1s in the binary form of a number
// so created a copy of the start number which helps count the number of digits

