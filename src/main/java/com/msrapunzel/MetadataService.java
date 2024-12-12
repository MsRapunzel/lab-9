/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.msrapunzel;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.inject.Inject;
import java.util.Set;

/**
 *
 * @author msrapunzel
 */
@ApplicationScoped
public class MetadataService {

    @Inject
    private BeanManager beanManager;

    public String getBeanMetadata() {
        Set<Bean<?>> beans = beanManager.getBeans(CalculationBean.class);
        Bean<?> bean = beanManager.resolve(beans);
        return "Bean class: " + bean.getBeanClass().getName() + ", Scope: " + bean.getScope().getName();
    }
}
