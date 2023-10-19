import java.util.Scanner;

public class Cryptography{

    public static String rotation(String input, int shift) {
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String output = "";
        int i = 0;
        //For each letter in the string, shift the letter by the specified shift amount.
        while (i < input.length()) {
            String letter = input.substring(i, i+1);
            int index = alphabet.indexOf(letter);
            //Checks if the character is a letter.
            if (index != -1) {
                index += shift;
                while (index > 25 || index < 0) {
                    if (index > 25) {
                        index -= 26;
                    } else if (index < 0) {
                        index += 26;
                    }
                }
                letter = alphabet.substring(index, index+1);
            }
            output += letter;
            i++;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputMessage = "";
        String inputNumber = "";
        while (!inputNumber.equals("0")) {
            System.out.println("Enter a String:");
            inputMessage = sc.nextLine();
            System.out.println("Enter a number to shift the message: (To quit, type '0')");
            inputNumber = sc.nextLine();
            System.out.println(rotation(inputMessage, Integer.valueOf(inputNumber)));
            System.out.println("");
        }
        System.out.println("Exited Program");


    }
} 
