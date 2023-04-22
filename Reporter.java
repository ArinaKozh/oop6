
public class Reporter implements Reportable {

    @Override
    public void Report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
    
}
