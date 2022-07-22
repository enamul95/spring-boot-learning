package com.app.beanconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "mail")
@Data
@Component
public class EmailProp {

    private String from;
    private String host;
    private String port;
}
