package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	private static AthleticGame athleticGame =new AthleticGame("calcio") ;  
	
	@Test
	public void addArrivalTest() {
		athleticGame.addArrival("ciccio", Instant.now());
		Assert.assertEquals(1,athleticGame.getArrivals().size());
	}
	@Test(expected = IllegalArgumentException.class)
	public void getParecipiantTimeTest() {
		athleticGame.getParecipiantTime(" ");
	}
}
