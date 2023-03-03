package tinysnow.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * application.yml 中还有 spring-doc 的许多配置项可以进行配置
 * 如 swagger-ui.enabled，swagger-ui.path 等
 * 详情请查看官方文档
 */
@Configuration
public class SpringDocConfiguration {
    public static final String title = "Spring Boot 与 Spring Doc 集成 Demo";
    public static final String description = "Spring Boot 与 Spring Doc 集成 Demo 的后端接口文档";
    public static final String version = "v0.0.1";
    public static final String license = "MIT License";

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title(title)
                        .description(description)
                        .version(version)
                        .license(new License().name(license)));
    }
}
