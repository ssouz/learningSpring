package com.souz;

import com.souz.services.OrderBusinessService;
import com.souz.services.OrderBusinessService2;
import com.souz.services.OrdersBusinessServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class SpringConfig {
    @Bean(name = "orderBusinessService", initMethod = "init", destroyMethod = "destroy")
    //@SessionScope
    @RequestScope
    public OrdersBusinessServiceInterface getOrdersBusiness(){
        return new OrderBusinessService2();
    }
}
