package pe.edu.upeu.tercero.example.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:pe/edu/upeu/tercero/example/config/application-config.xml",
		"classpath:pe/edu/upeu/tercero/example/config/applicationContext-dao.xml"
//		"classpath:pe/edu/upeu/smscore/service/config/applicationContext-service.xml"
		})
public class AbstractUnitTest  {

	@Autowired
	@Qualifier("exampleDAO")
	protected ExampleDAO exampleDAO;

	@Test
	public void testFind(){
		System.out.println("HOLAA MUNDO CRUEL");
		System.out.println("exampleDAO::: "+exampleDAO);
//		System.out.println(baseTypeDao.findBaseTypeByTypeCategory("TYPE_INTITUTION").size());
	}
}