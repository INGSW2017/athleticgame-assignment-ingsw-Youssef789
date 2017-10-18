package it.unical.test;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	private static AthleticGame athleticGame ;
	
	@BeforeClass
	public static void inizializzazione() {
		athleticGame=new AthleticGame(" ");
	}
	
	@After
	public void resetTest() {
		athleticGame.reset();
	}
	
	@Before
	public void startTest() {
		athleticGame.start();
	}
	@Test
	public void getWinnerTest_1() {
		
	}
	@Test
	public void getWinnerTest_2() {
		
	}
}
