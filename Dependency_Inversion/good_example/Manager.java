public class Manager {
    // Manager fully independent
	// Reusability of manager (reuse manager with diffrent repositories),
	// Interchangeability (repository easily changeable), 
	// Testability (easily tested)
	private Interface_Repository theRepository;
	// Constructor
	public Manager(Interface_Repository iRepository)
	{
		this.theRepository = iRepository;
	}
	// Get name stored in Repository
	public String get()
	{
		return this.theRepository.load();
	}
}
