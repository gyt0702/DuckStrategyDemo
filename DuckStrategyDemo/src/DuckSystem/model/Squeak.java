package DuckSystem.model;

//变化的 quack() 行为实现类之二
public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("我会吱吱叫");
	}
}
