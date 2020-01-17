import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@EnableAutoConfiguration
@ServletComponentScan
public class ServletLifeCycle {
    public static void main(String[] args){
        SpringApplication.run(ServletLifeCycle.class, args);
    }
}
