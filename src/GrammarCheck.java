import java.util.Scanner;

public class GrammarCheck {
    public static void main(String[] args) {
        //Keyboard variable for reading words
        Scanner input = new Scanner(System.in);

        String word;

        System.out.print("Enter the Word :");
        word = input.next();

        //function call
        if (isInAlphabet(word))
            System.out.println("Yes, The word is belong the alphabet L");
        else
            System.out.println("No, The word isn't belong the alphabet L");

    }

    private static boolean isInAlphabet(String word){
        int wordLength = word.length();
        int counterOfA;
        int counterOfB;

        if (wordLength % 2 == 0){
            return false;
        }

        for (counterOfA = 0;counterOfA<wordLength;counterOfA++){
            if(word.charAt(counterOfA)!= 'a')
                break;
        }

        /*  counts of a's should
            apear exactly
            n/2 - 1  times */
        if (counterOfA * 2 != wordLength - 1)
            return false;

        // Rest of the characters must be all 'b'
        for (counterOfB = counterOfA; counterOfB < wordLength; counterOfB++){
            if (word.charAt(counterOfB) != 'b')
                return false;
        }
        return true;
    }
}
