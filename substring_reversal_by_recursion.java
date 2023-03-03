import java.util.Scanner;

public class ReverseWordsInParagraph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String paragraph = sc.nextLine();
        String reversedParagraph = reverseWordsInParagraph(paragraph);
        System.out.println(reversedParagraph);
        sc.close();
    }

    public static String reverseWordsInParagraph(String paragraph) {
        if (paragraph.length() == 0) {
            return paragraph;
        }

        String[] words = paragraph.split("\\s+");
        StringBuilder reversedParagraph = new StringBuilder();
        for (String word : words) {
            reversedParagraph.append(reverseString(word)).append(" ");
        }

        return reversedParagraph.toString();
    }

    public static String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
