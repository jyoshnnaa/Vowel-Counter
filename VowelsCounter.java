import java.util.Scanner;

public class VowelsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int vowelCount = 0;

        String lowerCaseInput = input.toLowerCase();

       
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char ch = lowerCaseInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

      
        System.out.println("Number of vowels in the string: " + vowelCount);

        sc.close();
    }
}


