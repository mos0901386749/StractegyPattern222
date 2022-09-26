
public class DecoyDuck extends Duck {

	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoway();
		}
	
	@Override
	public void display() {
		System.out.println("I'm Decoy duck");
	}

}
