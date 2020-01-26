import java.util.Scanner;

public class ContactList {

    /* Define your method here */
    public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName, int arraySize) {
        String contactNumber = "error";

        for (int i = 0; i < arraySize; ++i){
            if (nameVec[i].equals(contactName)) {
                contactNumber = phoneNumberVec[i];
            }
        }
        return contactNumber;
    }

    public static boolean isOdd(int indexNum){
        boolean isOdd = false;

        if(indexNum % 2 != 0) {
            isOdd = true;
        }

        return isOdd;
    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        String inputContact;
        int nameCounter = 0;
        int numberCounter = 0;

        int listElements = scnr.nextInt();
        String[] inputNames = new String[listElements];
        String[] inputNumbers = new String[listElements];

        for (int i = 0; i < (listElements * 2); ++i) {

            if (isOdd(i)){
                inputNumbers[numberCounter] = scnr.next();
                ++numberCounter;
            }
            else {
                inputNames[nameCounter] = scnr.next();
                ++nameCounter;
            }
        }


        inputContact = scnr.next();
        System.out.println(getPhoneNumber(inputNames, inputNumbers, inputContact, listElements));
    }
}
