package pe.edu.upeu.tercero.example.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upeu.tercero.example.domain.Institution;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:pe/edu/upeu/tercero/example/config/application-config.xml",
		"classpath:pe/edu/upeu/tercero/example/config/applicationContext-dao.xml"
//		"classpath:pe/edu/upeu/smscore/service/config/applicationContext-service.xml"
		})

public class ExampleDAOImplTest {

	@Autowired
//	@Qualifier("exampleDAO")
	protected ExampleDAO exampleDAO;

	@Test
	public void insertInstitution(){
		Institution i= new Institution();
		i.setUrl("www.upeu.edu.pe");
		i.setNameInstitution("Universidad Peruana Union");
		i.setSummary("Univedad con enfoque en valores");
		
		exampleDAO.saveInstitution(i);
		
		System.out.println(exampleDAO);
//		exampleDAO.saveInstitution(i);
		
//		System.out.println("exampleDAO::: "+exampleDAO.findInstitutionAll());
//		System.out.println(baseTypeDao.findBaseTypeByTypeCategory("TYPE_INTITUTION").size());
	}
	
	
}
