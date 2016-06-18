package edu.uniritter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.uniritter.monitor.MonitorApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MonitorApplicationTests {

	@Test
	public void contextLoads() {
		MonitorApplication m = new MonitorApplication();
	}

}
