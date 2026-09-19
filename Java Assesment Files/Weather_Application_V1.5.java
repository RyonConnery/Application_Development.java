public void main() {
    // Use the fully qualified Scanner class name for console input.
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Prompt for and store the number of random values to generate.
    System.out.print("Enter the number of random integers to generate: ");
    int numberOfValues = input.nextInt();

    // Create an integer array using the size entered by the user.
    int[] randomNumbers = new int[numberOfValues];

    // Create a Random object for generating whole numbers from 0 through 100.
    java.util.Random random = new java.util.Random();

    // Fill the array with random integers in the inclusive range 0 to 100.
    for (int index = 0; index < randomNumbers.length; index++) {
        randomNumbers[index] = random.nextInt(101);
    }

    // Display the generated array values, one number per line.
    System.out.println();
    System.out.println("Generated Random Numbers");
    System.out.println("------------------------");

    for (int value : randomNumbers) {
        System.out.println(value);
    }

    // Call the methods that find the highest and lowest values.
    int highestValue = findHighest(randomNumbers);
    int lowestValue = findLowest(randomNumbers);

    // Display the results with clear labels.
    System.out.println();
    System.out.println("Array Results");
    System.out.println("-------------");
    System.out.println("Highest value: " + highestValue);
    System.out.println("Lowest value: " + lowestValue);

    // Close the Scanner after all input has been processed.
    input.close();
}

/**
 * Finds the highest integer in an array using a for loop.
 *
 * @param values array of integer values to search
 * @return highest integer found in the array
 */
int findHighest(int[] values) {
    // Begin with the first array element as the current highest value.
    int highest = values[0];

    // Compare each remaining element with the current highest value.
    for (int index = 1; index < values.length; index++) {
        if (values[index] > highest) {
            highest = values[index];
        }
    }

    return highest;
}

/**
 * Finds the lowest integer in an array using Arrays.sort().
 *
 * @param values array of integer values to search
 * @return lowest integer found in the array
 */
int findLowest(int[] values) {
    // Make a copy so sorting does not change the original array displayed by main().
    int[] sortedValues = java.util.Arrays.copyOf(values, values.length);

    // Sort the copied array from lowest to highest.
    java.util.Arrays.sort(sortedValues);

    // After sorting, the first element is the lowest value.
    return sortedValues[0];
}
