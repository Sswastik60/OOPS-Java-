package Quest2;
import java.util.Scanner;

public class Thirdgate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        int cameras = sc.nextInt();
        int faultycameras = 0;
        
        for (int i = 1; i <= cameras; i++) {
            float error = (seed % (i + 1)) / 100.0f;
            if (error > 0.2f) {
                if (faultycameras == 0) {
                    System.out.println("FAULTY CAMERAS");
                }
                System.out.println(i);
                faultycameras++;
            }
        }
        if (faultycameras == 0) {
            System.out.println("ALL CAMERAS STABLE");
        }
        sc.close();
    }
}
