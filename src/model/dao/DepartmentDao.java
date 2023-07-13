package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); // responsasvel por inserir no banco de dados
	void update(Department obj);
	void deleteById(Integer id);
	Department findDyId(Integer id); // consultar no banco de dados
	List<Department> findAll();
	
}
