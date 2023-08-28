public class Main {
    public static void main(String[] args) {

        // Convert Foot and inches to centimeters with overload method
        System.out.println("5 feet, 8 inches = " + convertInchesToCentimeters(5, 8) + " centimeters");
        // Convert inches to centimeters
        System.out.println("68 inches = " + convertInchesToCentimeters(68) + " centimeters");
    }

    public static double convertInchesToCentimeters(int heightInInches){
        // Multiply inches by 2.54 to get centimeters
        return heightInInches * 2.54;
    }

    // Overload method
    public static double convertInchesToCentimeters(int heightInFeet, int remainingHeightInInches){
        // First calculate feet to inches
        int heightInFeetToInches = heightInFeet * 12;
        // Calculate total inches
        int totalHeightInInches = heightInFeetToInches + remainingHeightInInches;
        // Convert total inches to centimeters
        return convertInchesToCentimeters(totalHeightInInches);
    }
}