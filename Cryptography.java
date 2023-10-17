import java.util.Scanner;
public class Cryptography{
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the string you want to encode with the rotation number in a comma after it. An example is \"Hello, 10\"");
        String input = sc.nextLine();
        while (!input.equals("stop")){
            System.out.println(cipher(input));
            System.out.println("Please input the string you want to encode with the rotation number in a comma after it. An example is \"Hello, 10\"");

        }
        System.out.println("Exited Cryptography");
        //System.out.println(cipher("vwxyz, 7"));
        //System.out.println(cipher("abcde, -7"));
    }
    public static String cipher(String original){
        int index = original.indexOf(",");
        if (index > -1){
            String words = original.substring(0, index);
            words = words.toLowerCase();
            String change = original.substring(index+1);
            int space = change.indexOf(" ");
            if (space >= 0){
                change = change.substring(space+1);}
            int shift = Integer.parseInt(change);
            System.out.println(shift);
            for (int i = 0; i < words.length(); i++){
                int charUsed = alphabet.indexOf(words.charAt(i));
                System.out.println(charUsed);
                charUsed += shift;
                while (charUsed >= 26){
                    charUsed-=26;
                }
                while (charUsed < 0){
                    charUsed+=26;
                }
                words = words.replace(words.charAt(i),alphabet.charAt(charUsed));
            }
            return words;
        }
        else{
            String words = original;
            for (int i = 0; i < words.length(); i++){
                int charUsed = alphabet.indexOf(words.charAt(i));
                charUsed+= 3;
                while (charUsed >= 26){
                    charUsed-=26;
                }
                while (charUsed < 0){
                    charUsed+=26;
                }
                words = words.replace(words.charAt(i),alphabet.charAt(charUsed));
            }
            return words;

        }
    }
}