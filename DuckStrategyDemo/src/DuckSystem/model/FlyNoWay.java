package DuckSystem.model;

//�仯�� fly() ��Ϊ��ʵ����֮��
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("<<<�Ҳ����>>>");
	}
}