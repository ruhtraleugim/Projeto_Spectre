package br.com.SpectreDemo.Specrte.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Permitir acesso de qualquer origem
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permitir os métodos HTTP especificados
                .allowedHeaders("*"); // Permitir todos os cabeçalhos
    }
}