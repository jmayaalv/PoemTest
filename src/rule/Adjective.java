package rule;

public class Adjective implements Rule {

	static String[] arrayWord;
	
	public void setWord(String[] arrayword ){
		this.arrayWord = arrayword;
	}
	
		
	@Override
	public String getWord() {
		int index = (int) (Math.random() * (arrayWord.length + 1)); 
		return arrayWord[index];
	}

}
