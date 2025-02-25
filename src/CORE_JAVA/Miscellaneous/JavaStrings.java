package CORE_JAVA.Miscellaneous;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class JavaStrings {




    public static void main(String args[]){

        String firstName = "Sikander";
        String lastName =  "Mehmood";


        String concatString = firstName.concat(" ").concat(lastName);
        System.out.println(concatString);


        //With StringBuilder/StringBuffer strings are created just like normal mutable objects like they can be modified.
        //StringBuilder is NOT Thread safe.
        //StringBuffer is thread safe.


        StringBuilder stringBuilder = new StringBuilder("Sikander");
        stringBuilder.append(" ");
        stringBuilder.append("Mehmood");
        stringBuilder.delete(0,3);
        stringBuilder.insert(0,"sik");
        System.out.println(stringBuilder.toString());



        //String BuiltIn Functions to Normalize

        System.out.println("-----------------------------------------Different stringBuiltIn Functions  -------------------------------------------------");

        String dummyString = "SikanderIsAwesome ";

        System.out.println(dummyString.trim());               // "sikanderIsAwesome"
        System.out.println(dummyString.toLowerCase());        //  "sikanderisawesome"
        System.out.println(dummyString.charAt(0));            //   'S'
        System.out.println(dummyString.contains("Sik"));      //   true
        System.out.println(dummyString.lastIndexOf('A',15));  // 10
        System.out.println(dummyString.indexOf("S"));                      // 0


       // ---------------------------------------------------------------------------
        System.out.println("--------------------------------------Counting sentences and words  -------------------------------------------------");

        String text = "This is a long text in which you might need to find the total number of words in the string and also total number of sentences. A sentence can be defined as some list of chracters" +
                      " that are enging with a dot operator or semicolon of questionMark operator.";

        String[] allWordsInTheText = text.split(" |-");
        System.out.println(Arrays.asList(allWordsInTheText));
        System.out.println("Total words  = " + allWordsInTheText.length);

        String[] allSentencesInText  = text.split("\\.");
        System.out.println(Arrays.asList(allSentencesInText));
        System.out.println(allSentencesInText.length);


        System.out.println("-------------------------------Checking equality  -------------------------------------------------");
        //When you need to compare strings , always use .equals method, because this method will compare only value ignoring address and pointers.

        String simpleString =  "Sikander";
        String simpleString2 = "Sikander";

        String simpleString3 = new String("Sikander");

        System.out.println(simpleString.equals(simpleString2)); //true
        System.out.println(simpleString.equals(simpleString3));  //true

        System.out.println(simpleString==simpleString2); //true
        System.out.println(simpleString==simpleString3);  //false



        System.out.println("-------------------------------Practice Question-------------------------------------------------");


        String palindrome = "rdaaxyxaadr";
        char[] characters = palindrome.toCharArray();
        Stack<Character> stack  = new Stack<>();

        for(int i=0;i<characters.length;i++){
            stack.push(characters[i]);
        }


        char[] newChars = new char[characters.length];

        for (int i=0;i<characters.length;i++){
            newChars[i]= stack.pop();

        }

        if(palindrome.equals(String.valueOf(newChars))){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        //Another solution is to use Stream to check if the word is Palindrome or NOT;

        System.out.println(IntStream.range(0,palindrome.length()/2).allMatch(val-> palindrome.charAt(val)==palindrome.charAt(palindrome.length()-val-1)));


    }


}
