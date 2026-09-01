public void main() {
    // Use the fully qualified Scanner class name for console input.
    java.util.Scanner input = new java.util.Scanner(System.in);

    // Define the exact set of special characters allowed by the assessment.
    String specialCharacters = "!@#$%^&*()-_+=[]{}|\\:;\"'<>,.?/~";

    // Prompt the user to enter a password and store it as a String.
    System.out.print("Enter a password to validate: ");
    String password = input.nextLine();

    // Boolean variables track whether the password meets each requirement.
    boolean hasValidLength = false;
    boolean hasUppercaseLetter = false;
    boolean hasDigit = false;
    boolean hasSpecialCharacter = false;
    boolean hasNoWhitespace = false;

    // Track whitespace while examining the password one character at a time.
    boolean containsWhitespace = false;

    // Check whether the password contains at least 8 characters.
    if (password.length() >= 8) {
        hasValidLength = true;
    }

    // Enhanced for loop analyzes every character in the password.
    for (char currentCharacter : password.toCharArray()) {

        // Check whether the current character is an uppercase letter.
        if (Character.isUpperCase(currentCharacter)) {
            hasUppercaseLetter = true;
        }

        // Check whether the current character is a digit.
        if (Character.isDigit(currentCharacter)) {
            hasDigit = true;
        }

        // Check whether the current character is whitespace.
        if (Character.isWhitespace(currentCharacter)) {
            containsWhitespace = true;
        }

        // Check whether the current character belongs to the required special-character set.
        if (specialCharacters.indexOf(currentCharacter) >= 0) {
            hasSpecialCharacter = true;
        }
    }

    // The password satisfies the no-space requirement only when no whitespace was found.
    if (!containsWhitespace) {
        hasNoWhitespace = true;
    }

    // Report whether all password requirements were satisfied.
    if (hasValidLength
            && hasUppercaseLetter
            && hasDigit
            && hasSpecialCharacter
            && hasNoWhitespace) {

        System.out.println("Password is valid.");
    } else {
        System.out.println("Password is not valid.");

        // Explain each unmet requirement so the validation result is easy to understand.
        if (!hasValidLength) {
            System.out.println("- Password must be at least 8 characters long.");
        }

        if (!hasNoWhitespace) {
            System.out.println("- Password must not contain spaces or other whitespace.");
        }

        if (!hasUppercaseLetter) {
            System.out.println("- Password must contain at least one uppercase letter.");
        }

        if (!hasDigit) {
            System.out.println("- Password must contain at least one digit.");
        }

        if (!hasSpecialCharacter) {
            System.out.println("- Password must contain at least one required special character.");
        }
    }

    // Close the Scanner after all input has been processed.
    input.close();
}