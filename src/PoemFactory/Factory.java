package PoemFactory;

import start.FileManager;
import RuleFactory.AdjectiveFactory;
import RuleFactory.LineFactory;
import RuleFactory.NounFactory;
import RuleFactory.PrepositionFactory;
import RuleFactory.PronounFactory;
import RuleFactory.VerbFactory;

public class Factory {
	
	public AdjectiveFactory adjetive = new AdjectiveFactory();
	public VerbFactory verb = new VerbFactory();
	public NounFactory noun = new NounFactory();
	public PronounFactory pronoun = new PronounFactory();
	public PrepositionFactory preposition = new PrepositionFactory();
	public LineFactory line = new LineFactory();
	public String[] poemStructure ; 
	
	
	public Factory() {
		
		FileManager file = new FileManager();
		file.setData();
		
		this.poemStructure  =  file.poem;
		
		line.sedRules(file.line, file.lineReference);
		
		adjetive.sedRules(file.adjective, file.adjectiveReference);
		
		noun.sedRules(file.noun, file.nounReference);
		
		pronoun.sedRules(file.pronoun, file.pronounReference);
		
		verb.sedRules(file.verb, file.verbReference);
		
		preposition.sedRules(file.preposition, file.prepositionReference);
	}
	

	public AdjectiveFactory getAdjetive() {
		return this.adjetive;
	}


	public VerbFactory getVerb() {
		return verb;
	}


	public NounFactory getNoun() {
		return noun;
	}


	public PronounFactory getPronoun() {
		return pronoun;
	}


	public PrepositionFactory getPreposition() {
		return preposition;
	}
	
	public LineFactory getLine() {
		return line;
	}


	
	
	

}
