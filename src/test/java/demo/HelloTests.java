package demo;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class HelloTests {

	@Test
	public void testContextLoads() {
		String test = null;
		assertNull("String is null !!!", test);
	}

}