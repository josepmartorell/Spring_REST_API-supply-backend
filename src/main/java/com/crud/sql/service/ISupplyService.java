package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Supply;

public interface ISupplyService {
	
	//CRUD methods
	public List<Supply> listSupplies();	
	public Supply saveSupply(Supply piece);	
	public Supply supplyXID(int id);
	public Supply updateSupply(Supply piece);	
	public void eliminateSupply(int id);

}
