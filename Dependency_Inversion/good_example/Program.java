public class Program {
    public static void main(String[] args) 
	{
		// inversion of control - generation dependency no longer in manager
		// Only Main knows of concrete class Repository
		Repository repository = new Repository(); 
		// Print name of Manager
		System.out.print(new Manager((Interface_Repository) repository).get());
	}
}
