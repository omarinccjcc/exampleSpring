package pe.edu.upeu.tercero.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:pe/edu/upeu/tercero/example/config/application-config.xml",
		"classpath:pe/edu/upeu/tercero/example/config/applicationContext-dao.xml",
		"classpath:pe/edu/upeu/tercero/example/service/config/applicationContext-service.xml" })
public class ExampleServiceTest {

	@Autowired
	@Qualifier("exampleService")
	protected ExampleService exampleService;

	@Test
	public void testFindInstitutionAll() {
		System.out.println(exampleService.findInstitutionAll());
	}
}
