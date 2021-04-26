public class Manager
{
	// dependency 1
	private Repository theRepository;
	
	public Manager()
	{
		// dependency 2
		this.theRepository = new Repository();
	}
	public String get()
	{
		// dependency 3
		return this.theRepository.load();
	}
	
}
