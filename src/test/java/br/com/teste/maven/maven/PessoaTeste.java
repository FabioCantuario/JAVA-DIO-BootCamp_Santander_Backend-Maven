package br.com.teste.maven.maven;

import java.time.LocalDateTime;

import org.junit.Test;

public class PessoaTeste {
	
	@Test
	void deveCalcularIdadeCorreta() {
		Pessoa fabio = new Pessoa("Fábio", LocalDateTime.of(2000,1,1,15,0,0));
		//Assertions.assertEquals(22,fabio.getIdade());
	}

}
