package mockitoj2.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.Times;
import mockitoj2.demo.dao.DatabaseDAO;
import mockitoj2.demo.dao.NetworkDAO;
import mockitoj2.demo.services.RecordService;

public class ApplicationTest {

	
	@Before
	public void initMocks()
	{
		MockitoAnnotations.initMocks(this);
		
		
	}
	@InjectMocks
	RecordService recordService;
	@Mock
	DatabaseDAO databaseMock;
	@Mock
	NetworkDAO networkMock;
	@Test
	public void saveTest()
	{
		boolean saved= recordService.save("tmp.txt");
		assertEquals(true,saved);
	//	verify(databaseMock , times(1)).save("temp.txt");
		
		
		
	}
	
}
