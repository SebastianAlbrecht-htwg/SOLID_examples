public class Dog implements AnimalAction{
	public void bark(){
		System.out.println("Dog is barking!");
	}
    // Violates the ISP
	@Override
	public void fly() {
		// Dog cannot fly, therefore do nothing
	}
	// Violates the ISP
	@Override
	public void swim() {
		// Dog cannot swim, therefore do nothing
	}
}
