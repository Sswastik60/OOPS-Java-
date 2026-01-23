package Java_practice.OOPS.Quest2;
import java.util.Scanner;

public class Thirdgate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        int cameras = sc.nextInt();
        int faultycameras = 0;
        for (int i = 1; i <= cameras; i++) {
            float error = ((seed )%(i+1))/100.00f;
            if (error>0.2) {
                faultycameras++;
            }
        }
        if (faultycameras>0) {
            System.out.println("FAULTY CAMERAS:\n"+faultycameras);
        }
        else System.out.println("ALL CAMERAS STABLE");
    }
}
//as per the formula given in the gate 3 question error doesnt exceed 0.2 so ig the expected output is a typo or misprint
