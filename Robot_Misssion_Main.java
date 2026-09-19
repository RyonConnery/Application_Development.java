void main() {
    // Use Scanner to read all user input from the console.
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Create a fixed-size array that will store exactly three RobotMission objects.
    RobotMission[] missions = new RobotMission[3];

    // Use a for loop to collect the data needed for each RobotMission object.
    for (int index = 0; index < missions.length; index++) {
        System.out.println();
        System.out.println("Enter data for mission " + (index + 1));
        System.out.println("-------------------------");

        System.out.print("Mission name: ");
        String missionName = input.nextLine();

        System.out.print("Starting battery percentage (0-100): ");
        double batteryLevel = input.nextDouble();

        // Nested validation loop: battery percentage must remain in the 0-100 range.
        while (batteryLevel < 0 || batteryLevel > 100) {
            System.out.println("Invalid battery percentage. Enter a value from 0 to 100.");
            System.out.print("Starting battery percentage (0-100): ");
            batteryLevel = input.nextDouble();
        }

        System.out.print("Mission duration in minutes: ");
        int durationMinutes = input.nextInt();

        System.out.print("Estimated battery use per minute: ");
        double batteryUsePerMinute = input.nextDouble();
        input.nextLine();

        // Construct and store the RobotMission object in the array.
        missions[index] = new RobotMission(
                missionName,
                batteryLevel,
                durationMinutes,
                batteryUsePerMinute);
    }

    // Use a for loop to print every object.
    // println() automatically calls each RobotMission object's toString() method.
    System.out.println();
    System.out.println("Robot Mission Summary");
    System.out.println("=====================");

    for (int index = 0; index < missions.length; index++) {
        System.out.println(missions[index]);
        System.out.println();
    }

    input.close();
}
