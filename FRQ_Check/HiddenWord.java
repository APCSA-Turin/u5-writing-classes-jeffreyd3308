public class HiddenWord {
	private String word;
	
	public HiddenWord(String word) {
		this.word = word;
	}

	public String getHint(String guess) {
		String returnedStr = "";
		for (int x = 0; x < guess.length(); x++) {
			String correctLetter = word.substring(x, x+1);
			String guessLetter = guess.substring(x, x+1);
			if (correctLetter.equals(guessLetter)) {
				returnedStr += guessLetter;
			} else if (word.indexOf(guessLetter) != -1) {
				returnedStr += "+";
			} else { 
				returnedStr += "*";
			}
        }
		return returnedStr;
	}
}

