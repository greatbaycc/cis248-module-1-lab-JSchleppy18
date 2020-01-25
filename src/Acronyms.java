import java.util.Scanner;

public class Acronyms {

    /* Define your method here */
    public static String createAcronym(String userPhrase) {
        String acronym = "";

        for(int i = 0; i < userPhrase.length(); ++i){
            if (userPhrase.charAt(i) > 64 && userPhrase.charAt(i) < 91) {
                acronym += userPhrase.charAt(i);
            }
        }
        return acronym;
    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        String inputPhrase;

        inputPhrase = scnr.nextLine();


        System.out.println(createAcronym(inputPhrase));
    }
}