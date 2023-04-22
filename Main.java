public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		user.report(new Reporter());
		user.save(new Persister());
	}
}