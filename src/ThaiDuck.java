
public class ThaiDuck extends Duck {
	
	public ThaiDuck() {
		quackBehavior = new Kab();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm real Thai duck");
	}
	
}
