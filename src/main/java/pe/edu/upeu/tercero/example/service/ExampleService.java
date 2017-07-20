package pe.edu.upeu.tercero.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.tercero.example.dao.ExampleDAO;
import pe.edu.upeu.tercero.example.domain.Institution;

@Service("exampleService")
public class ExampleService {

	@Autowired
	protected ExampleDAO exampleDAO;

	public void saveInstitution(Institution institution) {
		exampleDAO.saveInstitution(institution);
	}

	public void updateInstitution(Institution institution) {
		exampleDAO.updateInstitution(institution);
	}

	public Institution findInstitutionById(Long id) {
		return exampleDAO.findInstitutionById(id);
	}
	
	public void deleteInstitution(Institution institution){
		exampleDAO.deleteInstitution(institution);
	}
	
	public List<Institution> findInstitutionAll(){
		return exampleDAO.findInstitutionAll(); 
	}

}
