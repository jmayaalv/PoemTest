package RuleFactory;


public abstract class WordRule {
	
	 String[] arrayWord;
	 String[] reference;

	
	public void sedRules(String[] arrayword , String[] reference){
		this.arrayWord = arrayword;
		this.reference = reference;
	}
	
	public  String getRule(){
		int indexWord = (int) (Math.random() * (arrayWord.length));
		int indexReference = (int) (Math.random() * (reference.length)); 
	
		return arrayWord[indexWord] +" " + reference[indexReference]  ;
	}


}
