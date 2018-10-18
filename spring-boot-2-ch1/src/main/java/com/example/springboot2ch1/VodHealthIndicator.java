package com.example.springboot2ch1;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:alanho123@gmail.com">Jason Ho</a>
 */
@Component
public class VodHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.up().withDetail("up", "service is running...").build();
    }
}
