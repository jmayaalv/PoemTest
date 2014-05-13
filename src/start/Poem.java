package start;

import PoemFactory.Factory;
import PoemFactory.RuleFactory;

public class Poem {

	public Factory factory = new Factory();
	RuleFactory ruleFactory = new RuleFactory(factory);

	public static void main(String[] args) {
		Poem poem = new Poem();
		poem.start();

	}

	public void start() {

		for (int i = 0; i < factory.poemStructure.length; i++) {
			if (factory.poemStructure[i].equals("<LINE>")) {
				System.out.println(ruleFactory.getRuleFactory(factory.getLine()));

			}

		}

	}
	
	
		

}
