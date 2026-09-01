public void main() {
    // Create a Scanner object to read user input from the console.
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt for and store the user's location.
    System.out.print("Enter your city or town: ");
    String location = input.nextLine();

    // Prompt for and store the current temperature in degrees Fahrenheit.
    System.out.print("Enter the current temperature in degrees Fahrenheit: ");
    int temperatureFahrenheit = input.nextInt();

    // Prompt for and store the current wind speed in miles per hour.
    System.out.print("Enter the current wind speed in miles per hour: ");
    int windSpeedMph = input.nextInt();

    // Display the location and converted weather information in a readable format.
    System.out.println();
    System.out.println("Weather Information");
    System.out.println("-------------------");
    System.out.println("Location: " + location);

    // Validate the Fahrenheit temperature before performing conversions.
    if (temperatureFahrenheit >= -100 && temperatureFahrenheit <= 140) {

        // Convert the Fahrenheit temperature to Celsius and Kelvin.
        double temperatureCelsius =
                (temperatureFahrenheit - 32) * 5.0 / 9.0;

        double temperatureKelvin =
                temperatureCelsius + 273.15;

        System.out.println("Temperature (Fahrenheit): "
                + temperatureFahrenheit + " °F");
        System.out.printf("Temperature (Celsius): %.2f °C%n",
                temperatureCelsius);
        System.out.printf("Temperature (Kelvin): %.2f K%n",
                temperatureKelvin);

    } else {

        // Display a message when the temperature is outside the valid range.
        System.out.println(
                "Invalid temperature: temperature must be between -100 °F and 140 °F.");
    }

    // Validate the wind speed before performing conversions.
    if (windSpeedMph >= 0) {

        // Convert the wind speed from miles per hour to meters per second and knots.
        double windSpeedMetersPerSecond =
                windSpeedMph * 0.44704;

        double windSpeedKnots =
                windSpeedMph * 0.868976;

        // Determine the wind condition using the required wind-speed scale.
        String windCondition;

        if (windSpeedMph <= 1) {
            windCondition = "Calm";
        } else if (windSpeedMph <= 3) {
            windCondition = "Very light breeze";
        } else if (windSpeedMph <= 7) {
            windCondition = "Light breeze";
        } else if (windSpeedMph <= 12) {
            windCondition = "Gentle breeze";
        } else if (windSpeedMph <= 18) {
            windCondition = "Moderate breeze";
        } else if (windSpeedMph <= 24) {
            windCondition = "Fresh breeze";
        } else {
            windCondition = "Strong breeze";
        }

        System.out.println("Wind Speed (Miles per Hour): "
                + windSpeedMph + " mph");
        System.out.println("Wind Condition: " + windCondition);
        System.out.printf("Wind Speed (Meters per Second): %.2f m/s%n",
                windSpeedMetersPerSecond);
        System.out.printf("Wind Speed (Knots): %.2f knots%n",
                windSpeedKnots);

    } else {

        // Display a message when the wind speed is negative.
        System.out.println(
                "Invalid wind speed: wind speed cannot be negative.");
    }

    // Close the Scanner after all input has been processed.
    input.close();
}