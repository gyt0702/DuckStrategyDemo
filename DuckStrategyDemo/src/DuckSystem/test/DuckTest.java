package DuckSystem.test;

import DuckSystem.model.RedheadDuck;
import DuckSystem.model.RubberDuck;

import DuckSystem.model.Duck;
import DuckSystem.model.MallardDuck;

public class DuckTest {
	  public static void main(String[] args) {
		  Duck mallarduck = new MallardDuck();
		  	mallarduck.display();
			mallarduck.performFly();
			mallarduck.performQuack();
			mallarduck.swim();

			Duck rubberduck = new RubberDuck();
			rubberduck.display();
			rubberduck.performFly();
			rubberduck.performQuack();
			rubberduck.swim();

			Duck redheadduck = new RedheadDuck();
			redheadduck.display();
			redheadduck.performFly();
			redheadduck.performQuack();
			redheadduck.swim();
	  }
	 
}