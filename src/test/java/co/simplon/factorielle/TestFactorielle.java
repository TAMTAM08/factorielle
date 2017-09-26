package co.simplon.factorielle;


import static org.junit.Assert.*;

import org.junit.Test;

import co.simplon.factorielle.Factorielle;

public class TestFactorielle {

	@Test
	public void factorielle_de_4_doit_renvoyer_24() {
		//Given ;
		long n=4;
		Factorielle factorielle =new Factorielle();
				
			//	when 
				long resultat =factorielle.calculer(n);
				//then
		
				assertEquals(24,resultat);
		
	}
	
	@Test
	public void factorielle_de_0_doit_renvoyer_1() {
		//Given ;
		long n=0;
		Factorielle factorielle =new Factorielle();
				
			//	when 
				long resultat =factorielle.calculer(n);
				//then
		
				assertEquals(1,resultat);
		
	}

@Test
public void factorielle_de_2_doit_renvoyer_2() {
	//Given ;
	long n=0;
	Factorielle factorielle =new Factorielle();
			
		//	when 
			long resultat =factorielle.calculer(n);
			//then
	
			assertEquals(2,resultat);
	
}

@Test
public void factorielle_de_3_doit_renvoyer_6() {
	//Given ;
	long n=0;
	Factorielle factorielle =new Factorielle();
			
		//	when 
			long resultat =factorielle.calculer(n);
			//then
	
			assertEquals(6,resultat);
	
}
@Test
public void factorielle_de_19_doit_renvoyer_121645100408832000() {
	//Given ;
	long n=19;
	Factorielle factorielle =new Factorielle();
			
		//	when 
			long resultat =factorielle.calculer(n);
			//then
	
			assertEquals(121645100408832000l,resultat);
	
}
}