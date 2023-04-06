package pl.com.btc.tasklist.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@AllArgsConstructor
public class CorsConfig implements WebMvcConfigurer {

    private final CorsProperties corsProperties;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(corsProperties.getAllowedOrigins())
                .allowedHeaders(corsProperties.getAllowedHeaders())
                .allowedMethods(corsProperties.getAllowedMethods())
                .exposedHeaders(corsProperties.getExposedHeaders())
                .maxAge(corsProperties.getMaxAge())
                .allowCredentials(corsProperties.isAllowCredentials());
    }
}
