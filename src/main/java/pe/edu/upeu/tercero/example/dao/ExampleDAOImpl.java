package pe.edu.upeu.tercero.example.dao;

import java.util.List;

import pe.edu.upeu.tercero.example.domain.Institution;

public class ExampleDAOImpl extends BaseDAOHibernate implements ExampleDAO {

	public void saveInstitution(Institution institution) {
		save(institution);
	}

	public void updateInstitution(Institution institution) {
		update(institution);
	}

	public Institution findInstitutionById(Long id) {
		return findById(Institution.class, id);
	}
	
	public void deleteInstitution(Institution institution){
		delete(institution);
	}
	
	public List<Institution> findInstitutionAll(){
		return find(Institution.class, "FROM Institution"); 
	}
	
	
	
}
