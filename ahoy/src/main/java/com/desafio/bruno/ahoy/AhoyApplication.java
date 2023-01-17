package com.desafio.bruno.ahoy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.ws.config.annotation.EnableWs;

import java.util.TimeZone;

@SpringBootApplication
@ComponentScan(basePackages = {"com.desafio.bruno.ahoy.*"})
@EnableJpaAuditing
@EnableScheduling
@EnableWs
public class AhoyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		SpringApplication.run(AhoyApplication.class,args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
	// Configuração para utilizar o endpoint "actuator/httptrace" para obter a listagem das últimas conexões
	@Bean
	public HttpTraceRepository httpTraceRepository() {
		return new InMemoryHttpTraceRepository();
	}
}
