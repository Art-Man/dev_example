package com.yineng.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class Application {


	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		Environment env = app.run(args).getEnvironment();
		log.info("Access URLs:\n----------------------------------------------------------\n\t" +
						"Local: \t\thttp://127.0.0.1:{}{}\n\t" +
						"External: \thttp://{}:{}{}\n----------------------------------------------------------",
				env.getProperty("server.port"),
				env.getProperty("server.context-path"),
				InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"),
				env.getProperty("server.context-path"));
	}


}
