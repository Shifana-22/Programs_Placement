import java.util.Scanner;
public class MismatchString {
public static void compareStrings(String str1, String str2) {
int minLength = Math.min(str1.length(), str2.length());
for (int i = 0; i < minLength; i++) {
if (str1.charAt(i) != str2.charAt(i)) {
System.out.println(str1.charAt(i) + "," + str2.charAt(i));
}
}
if (str1.length() != str2.length()) {
int maxLength = Math.max(str1.length(), str2.length());
String longerString = str1.length() > str2.length() ? str1 : str2;
for (int i = minLength; i < maxLength; i++) {
System.out.println("N/A" + longerString.charAt(i));
}
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String str1 = scanner.nextLine();
String str2 = scanner.nextLine();
scanner.close();
compareStrings(str1, str2);
}
}
