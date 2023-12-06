package lab2;


import java.util.Scanner;

public class Driver {
    public static void  main(String[]args) {
    	Scanner scan = new Scanner(System.in);
    	
    	
    	System.out.println("Enter the Sentence: ");
    	String sentence = scan.nextLine();
    	
    	/**
    	 *  allows you to easily switch between different classes that implement the same interface without having to modify the code that uses them.
    	 */
    	
    	WordProcessor wordprocessor = new WordProcessor();
    	
        int countwords = wordprocessor.countWords(sentence);
        int countletters = wordprocessor.countLetters(sentence);
        int getLength = wordprocessor.getLength(sentence);
        
        System.out.println("word count: "+ countwords);
        System.out.println("letter count: "+ countletters);
        System.out.println("lenght of sentence(including space): "+ getLength);
    	
        scan.close();
    	
    	
    }
}

