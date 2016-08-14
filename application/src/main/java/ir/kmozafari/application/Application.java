package ir.kmozafari.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by kourosh on 8/8/16.
 */

@SpringBootApplication
@ComponentScan("ir.kmozafari.general")
//@PropertySources({@PropertySource("classpath:db.properties"), @PropertySource("classpath:web.properties")})
@EnableJpaRepositories(basePackages = "ir.kmozafari.general.persistence.repository")
@EntityScan(basePackages = "ir.kmozafari.general.persistence.entity")
//@EnableWebMvc
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("helloooooooooooooooo");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
