
public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		}
	
	@Override
	public void display() {
		System.out.println("I'm Readhead duck");
	}

}
