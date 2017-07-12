package module04;

/**
 * Created by tetya on 12.07.2017.
 */
public class main {
    public static void main(String[] args) {
        DeveloperDAO dDAO = new DeveloperDAOImpl();
        DeveloperController dC = new DeveloperController(dDAO);
        DeveloperView dV = new DeveloperView(dC);

       dV.main();
    }
}
