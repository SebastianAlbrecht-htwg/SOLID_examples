public class Bird implements AnimalAction{
	public void fly(){
		System.out.println("Bird is flying!");
	}
	// Violates the ISP
	@Override
	public void bark() {
		// Bird cannot bark, therefore do nothing
	}
	// Violates the ISP
	@Override
	public void swim() {
		// Bird cannot swim, therefore do nothing
	}
}
