package br.com.teste.maven.maven;

import java.time.LocalDateTime;

//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
	
	@Test
	void deveCalcularIdadeCorreta() {
		Pessoa fabio = new Pessoa("Fábio", LocalDateTime.of(2000,1,1,15,0,0));
		Assertions.assertEquals(22,fabio.getIdade());
	}
	
	@Test
	void validarLancamento() {
		int[] primeiro = { 10,20,30,50,40};
		int[] segundo = {10,20,30,5,40};
		
		Assertions.assertArrayEquals(primeiro,segundo);
	}

}

