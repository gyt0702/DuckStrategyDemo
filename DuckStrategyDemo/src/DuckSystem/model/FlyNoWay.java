package DuckSystem.model;

//变化的 fly() 行为的实现类之二
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("<<<我不会飞>>>");
	}
}