import org.example.ConsumerApp;
import org.example.EurekaApp2;
import org.example.EurekaApp;
import org.example.ProviderApp;
import org.springframework.boot.SpringApplication;

public class ParentApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class, args);
        SpringApplication.run(EurekaApp2.class, args);
        SpringApplication.run(ProviderApp.class, args);
        SpringApplication.run(ConsumerApp.class, args);
    }
}
