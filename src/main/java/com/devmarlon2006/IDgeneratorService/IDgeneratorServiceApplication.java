package com.devmarlon2006.IDgeneratorService;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class IDgeneratorServiceApplication {

	public static void main(String[] args) {

        //Personalized application
        SpringApplicationBuilder builder =
                new SpringApplicationBuilder(IDgeneratorServiceApplication.class);
        builder.bannerMode( Banner.Mode.OFF );
        builder.run(args);
        //
	}

}
