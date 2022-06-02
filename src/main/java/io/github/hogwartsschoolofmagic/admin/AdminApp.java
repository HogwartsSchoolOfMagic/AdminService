package io.github.hogwartsschoolofmagic.admin;

import static java.lang.System.nanoTime;
import static org.springframework.boot.SpringApplication.run;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * A class to run the entire spring application. To run, just use the command -
 * {@code mvn spring-boot:run}.
 *
 * @author Vladislav [SmithyVL] Kuznetsov.
 * @since 1.0.0.
 */
@Slf4j
@EnableAdminServer
@SpringBootApplication
public class AdminApp {
  /**
   * The Main method that launches the Spring context of the application - and outputs the duration
   * of the launch to the log.
   *
   * @param args launch arguments.
   */
  public static void main(String[] args) {
    var startTime = nanoTime();
    run(AdminApp.class, args);
    log.info("AdminApplication started for {} ms!", nanoTime() - startTime);
  }
}