package PoemFactory;

import RuleFactory.WordRule;

public class RuleFactory {
	
	Factory fact;
	
	
	
	public RuleFactory(Factory factory) {
		this.fact=factory;
		}

	public String getRuleFactory(WordRule factory){
		String objetRule = factory.getRule();

		String[] listRuleWord = objetRule.split(" ");
		
		for (int i = 0; i < listRuleWord.length; i++) {
					
		
	if(listRuleWord[i].contains("<NOUN>")){
		listRuleWord[i] =	listRuleWord[i].replace("<NOUN>", getRuleFactory(fact.getNoun()));
		}else
			if(listRuleWord[i].contains("<PREPOSITION>")){
				listRuleWord[i] =	listRuleWord[i].replace("<PREPOSITION>", getRuleFactory(fact.getPreposition()));
			}else
				if(listRuleWord[i].contains("<PRONOUN>")){
					listRuleWord[i] =	listRuleWord[i].replace("<PRONOUN>", getRuleFactory(fact.getPronoun()));
				}else
					if(listRuleWord[i].contains("<ADJECTIVE>")){
						listRuleWord[i] =	listRuleWord[i].replace("<ADJECTIVE>", getRuleFactory(fact.getAdjetive()));
					}
					else
						if(listRuleWord[i].contains("<VERB>")){
							listRuleWord[i] =		listRuleWord[i].replace("<VERB>", getRuleFactory(fact.getVerb()));
						}
						else
							if(listRuleWord[i].contains("$END")){
								listRuleWord[i] =		listRuleWord[i].replace("$END", "");					
								}else
									if(listRuleWord[i].contains("$LINEBREAK")){
										listRuleWord[i] =		listRuleWord[i].replace("$LINEBREAK", "\n");					
										}
		}
		String poem = "";
		for (int i = 0; i < listRuleWord.length; i++) {
			poem += " "+listRuleWord[i];
		}
		
		
	return poem;
	
	}
	
}
