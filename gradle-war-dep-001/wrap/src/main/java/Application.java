import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        try {
            System.out.println(Application.class.getResource("/lib/custom.war").toExternalForm());
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        context.close();
        System.exit(0);
    }
}