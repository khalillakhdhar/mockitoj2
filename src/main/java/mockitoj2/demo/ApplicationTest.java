package mockitoj2.demo;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

public class ApplicationTest {

	
	@Before
	public void initMocks()
	{
		MockitoAnnotations.initMocks(this);
		
		
	}
	
	
}
