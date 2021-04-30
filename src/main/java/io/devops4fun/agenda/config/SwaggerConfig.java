package io.devops4fun.agenda.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger class config
 *
 * @author rogeliomorelos
 */
@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    @Value("${info.app.version}")
    private String version;

    @Value("${info.app.name}")
    private String name;

    @Value("${info.app.description}")
    private String description;

    @Value("${info.app.license}")
    private String license;

    @Value("${info.app.url}")
    private String url;


    /**
     * @return apiInfo used for Swagger
     */
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title(name)
                        .description(description)
                        .version(version)
                        .license(new License().name(license).url(url)))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringShop Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }

}
