public class Bird implements Flyable{
    // No violation of ISP anymore
	@Override
	public void fly() {
		System.out.println("Bird is flying!");
	}
}
