package com.example.registryconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "spring.cloud.config.server")
public class ConfigurationServerConfig {

    private List<Map<String,Object>> composite = new ArrayList<>();

    public List<Map<String, Object>> getComposite() {
        return composite;
    }
}
