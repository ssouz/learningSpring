package com.souz;

import com.souz.services.OrderBusinessService;
import com.souz.services.OrderBusinessService2;
import com.souz.services.OrdersBusinessServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean(name = "orderBusinessService")
    public OrdersBusinessServiceInterface getOrdersBusiness(){
        return new OrderBusinessService2();
    }
}
