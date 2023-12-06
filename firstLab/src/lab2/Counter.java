package lab2;

public interface Counter {
	/**
	 * count number of the words in the sentences.
	 * @param sentence
	 * @return the count of the words in the sentences.
	 */
	int countWords (String sentence);
	
	/**
	 * count the Letters in the sentences.
	 * @param sentence
	 * @return the count of Letters in sentences.
	 */
	int countLetters (String sentence);
	
	/**
	 * Get the length of sentences.
	 * @param sentence
	 * @return the length of the sentences.
	 */
	int getLength (String sentence);
	
	

}
