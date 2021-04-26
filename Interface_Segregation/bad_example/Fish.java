public class Fish implements AnimalAction{
	public void swim(){
		System.out.println("Fish is swimming!");
	}	
    // Violates the ISP
	@Override
	public void fly() {
		// Fish cannot fly, therefore do nothing
	}
	@Override
	public void bark() {
		// Fish cannot bark, therefore do nothing
	}
	// Violates the ISP
}
