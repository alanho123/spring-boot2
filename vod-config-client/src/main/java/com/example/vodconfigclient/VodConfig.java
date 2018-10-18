package com.example.vodconfigclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author <a href="mailto:alanho123@gmail.com">Jason Ho</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VodConfig {

    @Value("${streaming.cdn.provider}")
    private String provider;

    @Value("${streaming.cdn.endpoint}")
    private String endpoint;

}
