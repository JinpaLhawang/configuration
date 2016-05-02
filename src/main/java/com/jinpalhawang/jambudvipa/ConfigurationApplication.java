package com.jinpalhawang.jambudvipa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigurationApplication {

  private static final Logger log = LoggerFactory.getLogger(ConfigurationApplication.class);

  public static void main(String[] args) {
    final SpringApplication app = new SpringApplication(ConfigurationApplication.class);
    app.setLogStartupInfo(false);
    app.run(args);
    log.info(ConfigurationApplication.class.getSimpleName() + " started.");
  }

}
