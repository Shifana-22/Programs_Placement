import java.util.Scanner;

public class MismatchedSubstrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        scanner.close();

        int minLength = Math.min(str1.length(), str2.length());
        for (int length = 1; length <= minLength; length++) {
            for (int i = 0; i <= str1.length() - length; i++) {
                String subStr1 = str1.substring(i, i + length);
                // Find the corresponding substring in str2
                int foundIndex = str2.indexOf(subStr1);
                // Check if substring mismatches exist
                if (foundIndex >= 0 && !subStr1.equals(str2.substring(foundIndex, foundIndex + length))) {
                    System.out.println("Mismatched substring: " + subStr1);
                }
            }
        }
    }
}
