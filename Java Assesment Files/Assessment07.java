public void main() {
    // Use the fully qualified Scanner class name for console input.
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Create an empty ArrayList that stores Integer values.
    java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

    // Create a Random object for generating whole numbers from 0 through 100.
    java.util.Random random = new java.util.Random();

    // Prompt for and store the number of random integers to generate.
    System.out.print("Enter the number of random integers to generate: ");
    int numberOfValues = input.nextInt();

    // Fill the ArrayList with the requested number of random integers.
    for (int index = 0; index < numberOfValues; index++) {
        numbers.add(random.nextInt(101));
    }

    // Display the generated values in a readable format.
    System.out.println();
    System.out.println("Generated Random Numbers");
    System.out.println("------------------------");

    for (int index = 0; index < numbers.size(); index++) {
        System.out.println(numbers.get(index));
    }

    // Call getMean() and store the floating-point result.
    double mean = getMean(numbers);

    // Call getMedian() and store the integer result.
    int median = getMedian(numbers);

    // Display the calculated statistics with clear labels.
    System.out.println();
    System.out.println("Statistical Results");
    System.out.println("-------------------");
    System.out.printf("Mean: %.2f%n", mean);
    System.out.println("Median: " + median);

    // Close the Scanner after all input has been processed.
    input.close();
}

/**
 * Calculates the arithmetic mean of the values in an ArrayList.
 *
 * @param numbers ArrayList containing integer values
 * @return floating-point mean of all values
 */
double getMean(java.util.ArrayList<Integer> numbers) {
    int total = 0;

    // Use size() and get() to visit each element and add it to the running total.
    for (int index = 0; index < numbers.size(); index++) {
        total += numbers.get(index);
    }

    // Cast the total to double so division preserves the decimal portion.
    return (double) total / numbers.size();
}

/**
 * Calculates the median of the values in an ArrayList.
 *
 * @param numbers ArrayList containing integer values
 * @return integer median of the sorted values
 */
int getMedian(java.util.ArrayList<Integer> numbers) {
    // Copy the ArrayList so sorting does not change the original list in main().
    java.util.ArrayList<Integer> sortedNumbers =
            new java.util.ArrayList<>(numbers);

    // Sort the copied ArrayList into ascending order using the default ordering.
    sortedNumbers.sort(null);

    int middleIndex = sortedNumbers.size() / 2;

    // For an odd number of values, return the single middle value.
    if (sortedNumbers.size() % 2 != 0) {
        return sortedNumbers.get(middleIndex);
    }

    // For an even number of values, return the integer average of the two middle values.
    int lowerMiddle = sortedNumbers.get(middleIndex - 1);
    int upperMiddle = sortedNumbers.get(middleIndex);

    return (lowerMiddle + upperMiddle) / 2;
}
