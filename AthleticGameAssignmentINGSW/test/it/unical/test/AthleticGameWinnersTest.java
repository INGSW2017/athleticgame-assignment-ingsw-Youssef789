package it.unical.test;
import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {
	private static AthleticGame athleticGame ;
	
	@BeforeClass
	public static void setUp() {
		athleticGame=new AthleticGame("football");
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
		athleticGame.addArrival("Roumia", Instant.now().plusMillis(1000));
		athleticGame.addArrival("Mohamed", Instant.now().plusMillis(2000));
		athleticGame.addArrival("Youseef", Instant.now().plusMillis(3000));
		athleticGame.addArrival("Ahmed", Instant.now().plusMillis(4000));
		athleticGame.addArrival("Elmetwally", Instant.now().plusMillis(5000));

		Assert.assertEquals("Roumia", athleticGame.getWinner());
	}
	@Test
	public void getWinnerTest_2() {
		athleticGame.addArrival("Roumia", Instant.now().plusMillis(1000));
		athleticGame.addArrival("Ahmed", Instant.now().plusMillis(500));
		Assert.assertEquals("Ahmed", athleticGame.getWinner());
	}
}
