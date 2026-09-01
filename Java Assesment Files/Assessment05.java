public void main() {
    // Use the fully qualified Scanner class name for console input.
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt for and store the user's location.
    System.out.print("Enter your city or town: ");
    String location = input.nextLine();

    // Prompt for and store the current temperature in degrees Fahrenheit.
    System.out.print("Enter the current temperature in degrees Fahrenheit: ");
    double temperatureFahrenheit = input.nextDouble();

    // Prompt for and store the current wind speed in miles per hour.
    System.out.print("Enter the current wind speed in miles per hour: ");
    double windSpeedMph = input.nextDouble();

    // Display the location and weather information in a readable format.
    System.out.println();
    System.out.println("Weather Information");
    System.out.println("-------------------");
    System.out.println("Location: " + location);

    // Validate the Fahrenheit temperature before calling the conversion methods.
    if (temperatureFahrenheit >= -100 && temperatureFahrenheit <= 140) {
        // Call the Celsius conversion method and store the returned value.
        double temperatureCelsius = convertFahrenheitToCelsius(temperatureFahrenheit);

        // Call the Kelvin conversion method and store the returned value.
        double temperatureKelvin = convertFahrenheitToKelvin(temperatureFahrenheit);

        System.out.printf("Temperature (Fahrenheit): %.2f °F%n",
                temperatureFahrenheit);
        System.out.printf("Temperature (Celsius): %.2f °C%n",
                temperatureCelsius);
        System.out.printf("Temperature (Kelvin): %.2f K%n",
                temperatureKelvin);
    } else {
        System.out.println(
                "Invalid temperature: temperature must be between -100 °F and 140 °F.");
    }

    // Validate the wind speed before calling the wind conversion methods.
    if (windSpeedMph >= 0) {
        // Call the meters-per-second conversion method and store the returned value.
        double windSpeedMetersPerSecond = convertMphToMetersPerSecond(windSpeedMph);

        // Call the knots conversion method and store the returned value.
        double windSpeedKnots = convertMphToKnots(windSpeedMph);

        // Call the wind-characterization method and store the returned description.
        String windCondition = characterizeWindSpeed(windSpeedMph);

        System.out.printf("Wind Speed (Miles per Hour): %.2f mph%n",
                windSpeedMph);
        System.out.println("Wind Condition: " + windCondition);
        System.out.printf("Wind Speed (Meters per Second): %.2f m/s%n",
                windSpeedMetersPerSecond);
        System.out.printf("Wind Speed (Knots): %.2f knots%n",
                windSpeedKnots);
    } else {
        System.out.println(
                "Invalid wind speed: wind speed cannot be negative.");
    }

    // Close the Scanner after all input has been processed.
    input.close();
}

/**
 * Converts a Fahrenheit temperature to Celsius.
 *
 * @param fahrenheit temperature in degrees Fahrenheit
 * @return converted temperature in degrees Celsius
 */
double convertFahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32.0) * 5.0 / 9.0;
}

/**
 * Converts a Fahrenheit temperature to Kelvin.
 *
 * @param fahrenheit temperature in degrees Fahrenheit
 * @return converted temperature in Kelvin
 */
double convertFahrenheitToKelvin(double fahrenheit) {
    double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
    return celsius + 273.15;
}

/**
 * Converts wind speed from miles per hour to meters per second.
 *
 * @param mph wind speed in miles per hour
 * @return converted wind speed in meters per second
 */
double convertMphToMetersPerSecond(double mph) {
    return mph * 0.44704;
}

/**
 * Converts wind speed from miles per hour to knots.
 *
 * @param mph wind speed in miles per hour
 * @return converted wind speed in knots
 */
double convertMphToKnots(double mph) {
    return mph * 0.868976;
}

/**
 * Characterizes wind speed using the scale required by the assessment.
 *
 * @param mph wind speed in miles per hour
 * @return description of the wind condition
 */
String characterizeWindSpeed(double mph) {
    if (mph <= 1) {
        return "Calm";
    } else if (mph <= 3) {
        return "Very light breeze";
    } else if (mph <= 7) {
        return "Light breeze";
    } else if (mph <= 12) {
        return "Gentle breeze";
    } else if (mph <= 18) {
        return "Moderate breeze";
    } else if (mph <= 24) {
        return "Fresh breeze";
    } else {
        return "Strong breeze";
    }
}
