package com.example.springboot2ch1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author <a href="mailto:alanho123@gmail.com">Jason Ho</a>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "vod.server")
public class VodSetting {

    private String host;
    private String port;
    private Integer timeout;
}
