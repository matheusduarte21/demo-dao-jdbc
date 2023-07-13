package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj); // responsasvel por inserir no banco de dados
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findDyId(Integer id); // consultar no banco de dados
	List<Seller> findAll();
}
