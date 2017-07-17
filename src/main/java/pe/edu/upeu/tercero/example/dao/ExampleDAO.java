package pe.edu.upeu.tercero.example.dao;

import java.util.List;

import pe.edu.upeu.tercero.example.domain.Institution;

public interface ExampleDAO {

	void saveInstitution(Institution institution);

	void updateInstitution(Institution institution);

	Institution findInstitutionById(Long id);

	void deleteInstitution(Institution institution);

	List<Institution> findInstitutionAll();

}
