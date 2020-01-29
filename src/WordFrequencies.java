import java.util.Scanner;

public class WordFrequencies {

    /* Define your method here */
    public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord){
        int frequencyCounter = 0;

        for (int i = 0; i < listSize; ++i){
            if (wordsList[i].equals(currWord)){
                ++frequencyCounter;
            }
        }

        return frequencyCounter;
    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int listSize = scnr.nextInt();
        String[] wordsList = new String[listSize];
        Integer[] frequencyList = new Integer[listSize];

        for (int i = 0; i < listSize; ++i){
            wordsList[i] = scnr.next();
        }

        for (int i = 0; i < listSize; ++i){
            frequencyList[i] = getFrequencyOfWord(wordsList, listSize, wordsList[i]);
        }

        for (int i = 0; i < listSize; ++i){
            System.out.println(wordsList[i] + " " + frequencyList[i]);
        }
    }
}

