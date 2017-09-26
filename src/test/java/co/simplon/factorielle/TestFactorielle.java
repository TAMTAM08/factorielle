package co.simplon.factorielle;


import static org.junit.Assert.*;

import org.junit.Test;

import co.simplon.factorielle.Factorielle;

public class TestFactorielle {

	@Test
	public void factorielle_de_1_doit_renvoyer_1() {
		//Given ;
		long n=1;
		Factorielle factorielle =new Factorielle();
				
			//	when 
				long resultat =factorielle.calculer(n);
				//then
		
				assertEquals(1,resultat);
		//fail("Not yet implemented");
	}

}
