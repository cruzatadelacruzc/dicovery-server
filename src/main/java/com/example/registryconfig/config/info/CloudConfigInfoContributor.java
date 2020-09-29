package com.example.registryconfig.config.info;

import com.example.registryconfig.config.ConfigurationServerConfig;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.cloud.config.client.ConfigClientProperties;
import org.springframework.stereotype.Component;

@Component
public class CloudConfigInfoContributor implements InfoContributor {

    private final ConfigClientProperties configClientProperties;
    private final ConfigurationServerConfig configurationServerConfig;

    public CloudConfigInfoContributor(ConfigClientProperties configClientProperties,
                                      ConfigurationServerConfig configurationServerConfig) {
        this.configClientProperties = configClientProperties;
        this.configurationServerConfig = configurationServerConfig;
    }

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("cloud-config-label", configClientProperties.getLabel());
        builder.withDetail("cloud-config-server-configuration-sources",configurationServerConfig.getComposite() );
    }
}
