package org.kreyssel.maven.failsafe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class SimpleITCase {

	@Autowired
	private MyController ctrl;
	
	@Before
	public void check() {
		assertNotNull(ctrl);
	}
	
	@Test
	public void test() {
		assertEquals("go", ctrl. go());
		
		System.err.println(Thread.currentThread());
	}
}
