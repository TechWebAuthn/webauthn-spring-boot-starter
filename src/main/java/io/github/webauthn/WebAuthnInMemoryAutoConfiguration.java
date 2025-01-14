package io.github.webauthn;


import io.github.webauthn.domain.*;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;

@Configuration
@AutoConfigureAfter(WebAuthnSpringDataAutoConfiguration.class)
public class WebAuthnInMemoryAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(WebAuthnUserRepository.class)
    public WebAuthnUserRepository webAuthnUserRepository() {
        return new WebAuthnUserInMemoryRepository();
    }

    @Bean
    @ConditionalOnMissingBean(WebAuthnCredentialsRepository.class)
    public WebAuthnCredentialsRepository webAuthnCredentialsRepository() {
        return new WebAuthnCredentialsInMemoryRepository();
    }
}
