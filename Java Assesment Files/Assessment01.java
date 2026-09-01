public void main() {
    // Displays the prompt and keeps the user's response on the same line.
    System.out.print("Enter your name: ");

    // Reads the complete line entered by the user.
    java.util.Scanner input = new java.util.Scanner(System.in);
    String userName = input.nextLine();

    // Combines the entered name with literal text to display the greeting.
    System.out.println("Hello, " + userName + "!");

    input.close();
}
