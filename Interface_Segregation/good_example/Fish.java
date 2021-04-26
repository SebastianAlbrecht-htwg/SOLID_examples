public class Fish implements Swimmable {
	// No violation of ISP anymore
	@Override
	public void swim() {
		System.out.println("Fish is swimming!");
	}
}
