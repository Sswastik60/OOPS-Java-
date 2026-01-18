public class batman {
    public static void main(String[] args) {

        int totalCameraFeeds = 6;
        int ambientLightLevel = 5;

        int camouflageIntensity = 0;
        boolean stealthModeActive = true;
        boolean intruderDetected = false;

        System.out.println("Initializing Batmobile Stealth System...\n");

        for (int feed = 1; feed <= totalCameraFeeds; feed++) {

            System.out.println("Processing camera feed " + feed);

            if (stealthModeActive == false) {// == instead of =
                System.out.println("Stealth mode disabled!");
                break;
            }

            if (feed % 3 == 0) {
                intruderDetected = true;
                System.out.println("Suspicious movement detected on feed " + feed);
            }

            if (ambientLightLevel < 3) {
                camouflageIntensity += 3;
            } 
            else if (ambientLightLevel >= 3 && ambientLightLevel <= 5) {
                camouflageIntensity = 2;
                continue;
            } 
            else {
                camouflageIntensity--;
            }

            if (camouflageIntensity < 0) {
                camouflageIntensity = 0;
            }

            System.out.println("Camouflage intensity set to "+ camouflageIntensity + "\n");//fixed syntax here--> cause after + there should not be a line break which was causing error while running the program
        }

        System.out.println("Final System Evaluation:");

        if (intruderDetected == true && camouflageIntensity > ambientLightLevel) {
            System.out.println("Stealth successful. Intruder evaded.");
        } 
        else if (intruderDetected == false) {
            System.out.println("Area secure. No threats detected.");
        } 
        else {
            System.out.println("WARNING: Batmobile exposed!");
        }
    }
}