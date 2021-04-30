package io.devops4fun.agenda.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

@Configuration
public class MyRepositoryRestConfigurerAdapter implements RepositoryRestConfigurer {

    private final EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
    }

    private final LocalValidatorFactoryBean beanValidator;

    public MyRepositoryRestConfigurerAdapter(LocalValidatorFactoryBean beanValidator, EntityManager entityManager) {
        this.beanValidator = beanValidator;
        this.entityManager = entityManager;
    }

    @Override
    public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener v) {
        v.addValidator("beforeCreate", beanValidator);
        v.addValidator("beforeSave", beanValidator);
    }

}