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

    // Convert the Fahrenheit temperature to Celsius and Kelvin.
    double temperatureCelsius =
            (temperatureFahrenheit - 32) * 5.0 / 9.0;

    double temperatureKelvin =
            temperatureCelsius + 273.15;

    // Convert the wind speed from miles per hour to meters per second and knots.
    double windSpeedMetersPerSecond =
            windSpeedMph * 0.44704;

    double windSpeedKnots =
            windSpeedMph * 0.868976;

    // Display the location and converted weather information in a readable format.
    System.out.println();
    System.out.println("Weather Information");
    System.out.println("-------------------");
    System.out.println("Location: " + location);
    System.out.println("Temperature (Fahrenheit): "
            + temperatureFahrenheit + " °F");
    System.out.printf("Temperature (Celsius): %.2f °C%n",
            temperatureCelsius);
    System.out.printf("Temperature (Kelvin): %.2f K%n",
            temperatureKelvin);
    System.out.println("Wind Speed (Miles per Hour): "
            + windSpeedMph + " mph");
    System.out.printf("Wind Speed (Meters per Second): %.2f m/s%n",
            windSpeedMetersPerSecond);
    System.out.printf("Wind Speed (Knots): %.2f knots%n",
            windSpeedKnots);

    // Close the Scanner after all input has been processed.
    input.close();
}