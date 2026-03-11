class NotEligibleForEngineering extends RuntimeException {
    NotEligibleForEngineering(String s) {
        super(s);
    }
}

class NotEligibleForVJIT extends RuntimeException {
    NotEligibleForVJIT(String s) {
        super(s);
    }
}

public class TSEngineeringAdmission {
    public static void main(String args[]) {

        try {
            int TSEAMCETScore = Integer.parseInt(args[0]);

            if (TSEAMCETScore < 50) {
                throw new NotEligibleForEngineering(
                        "Sorry, you are not eligible for applying for Engineering");
            } 
            else if (TSEAMCETScore < 70) {
                throw new NotEligibleForVJIT(
                        "Sorry, you are not eligible for applying for VJIT");
            } 
            else {
                System.out.println("Welcome to VJIT, now you are admitted!");
            }

        } 
        catch (NotEligibleForEngineering | NotEligibleForVJIT e) {
            System.out.println("Exception StackTrace:");
            e.printStackTrace();

            System.out.println("Exception Message: " + e.getMessage());
            System.out.println("Exception toString: " + e.toString());
        }

        System.out.println("Rest of the Code");
    }
}
