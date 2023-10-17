import java.util.Scanner;

public class Cryptography{

    public static String rotation(String input, int rotation) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            String letter = input.substring(i, i+1);
            int index = alphabet.indexOf(letter);
            if (index != -1) {
                index += rotation;
                while (index > 25) {
                    index -= 26;
                }
                while (index < 0) {
                    index += 26;
                }
                letter = alphabet.substring(index, index+1);
            }
            output += letter;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a String: ");
            String inputMessage = sc.nextLine();
            System.out.println("Enter a number to shift the message: ");
            String inputNumber = sc.nextLine();
            System.out.println(rotation(inputMessage, Integer.valueOf(inputNumber)));
            System.out.println("");
        }
        


    }
} 