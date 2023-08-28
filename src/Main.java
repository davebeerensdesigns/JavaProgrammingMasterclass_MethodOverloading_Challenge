public class Main {
    public static void main(String[] args) {
        // Convert inches to centimeters
        convertInchesToCentimeters(10);
        // Convert Foot and inches to centimeters with overload method
        convertInchesToCentimeters(3, 5);
    }

    public static double convertInchesToCentimeters(int heightInInches) {
        // Multiply inches by 2.54 to get centimeters
        double heightInCentimeters = heightInInches * 2.54;
        System.out.println(heightInInches + " inches = " + heightInCentimeters + " centimeters");
        return heightInCentimeters;
    }

    // Overload method
    public static double convertInchesToCentimeters(int heightInFeet, int remainingHeightInInches) {
        // First calculate feet to inches
        int heightInFeetToInches = heightInFeet * 12;
        // Calculate total inches
        int totalHeightInInches = heightInFeetToInches + remainingHeightInInches;
        // Convert total inches to centimeters
        return convertInchesToCentimeters(totalHeightInInches);
    }

}