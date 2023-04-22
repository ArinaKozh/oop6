public class Persister implements Savable{
	
	
	@Override
	public void Save(User user) {
		System.out.println("Save user: " + user.getName());
	}
}