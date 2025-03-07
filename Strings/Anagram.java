import java.util.Scanner;
public class Anagram {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first string");
    String str1 = sc.nextLine();
    System.out.println("Enter the second string");
    String str2 = sc.nextLine();
    if (str1.length() != str2.length()) {
      System.out.println("The strings are not anagrams");
      return;
    }
    int[] count = new int[256];
    for (int i = 0; i < str1.length(); i++) {
      count[str1.charAt(i)]++;
      count[str2.charAt(i)]--;
    }
    for (int i = 0; i < 256; i++) {
      if (count[i] != 0) {
        System.out.println("The strings are not anagrams");
        return;
      }
    }
    System.out.println("The strings are anagrams");
  }
}