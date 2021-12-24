package admin;

import static org.springframework.boot.SpringApplication.run;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A class to run the entire spring application. To run, just use the command -
 * {@code mvn spring-boot:run}.
 *
 * @author Vladislav [Bangerok] Kuznetsov.
 * @since 1.0.0.
 */
@EnableAdminServer
@SpringBootApplication
public class AdminServiceApplication {

  public static void main(String[] args) {
    run(AdminServiceApplication.class, args);
  }
}