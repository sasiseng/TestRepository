package com.sasi.sasiseng;

import com.sasi.dao.SasiSengDao;
import com.sasi.model.SasiSengFeedModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages =  {"com.sasi.dao", "com.sasi"})
@Configuration
public class SasisengApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SasisengApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(SasisengApplication.class);
	}
}
