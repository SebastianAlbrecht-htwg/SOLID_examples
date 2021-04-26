public class Dog implements Barkable{
	// No violation of ISP anymore
	@Override
	public void bark() {
		System.out.println("Dog is barking!");
	}    
}
