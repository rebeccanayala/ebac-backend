package com.example.springboot.webappspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import domain.Cliente;
import repository.IClienteRepository;

@Configuration
@EnableJpaRepositories("repository")
@SpringBootApplication
@EntityScan(basePackages = "domain")
public class WebappSpringbootApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(WebappSpringbootApplication.class);
	
	@Autowired
	private IClienteRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(WebappSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Iniciando a aplicação...");
		Cliente cliente = criarCliente();
		repository.save(cliente);
	}
	
	private Cliente criarCliente() {
		return Cliente.builder()
				.cidade("SP")
				.cpf(12312312310L)
				.email("teste@teste.com")
				.endereco("Endereço")
				.estado("SP")
				.nome("Teste Spring Boot")
				.numero(102030)
				.telefone(10203040L)
				.build();
	}

}

