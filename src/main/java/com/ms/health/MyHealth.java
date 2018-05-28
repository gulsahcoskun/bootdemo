package com.ms.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by GulsahCoskun on 28.05.2018.
 */
@Component
public class MyHealth implements HealthIndicator {



    @Override
    public Health health() {
        MyStatus status = new MyStatus();
        status.setCause(100);
        status.setDesc("fdsfsd");
        status.setExtra("extra");
        status.setDetail("detail");

        return Health.down().withDetail("error",status).build();
    }


}
