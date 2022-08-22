package com.crud.sql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.sql.dao.ISupplyDAO;
import com.crud.sql.dto.Supply;

@Service
public class SupplyServiceImpl implements ISupplyService{
	
	ISupplyDAO iSupplyDAO;

	@Override
	public List<Supply> listSupplies() {
		// TODO Auto-generated method stub
		return iSupplyDAO.findAll();
	}

	@Override
	public Supply saveSupply(Supply piece) {
		// TODO Auto-generated method stub
		return iSupplyDAO.save(piece);
	}

	@Override
	public Supply supplyXID(int id) {
		// TODO Auto-generated method stub
		return iSupplyDAO.findById(id).get();
	}

	@Override
	public Supply updateSupply(Supply piece) {
		// TODO Auto-generated method stub
		return iSupplyDAO.save(piece);
	}

	@Override
	public void eliminateSupply(int id) {
		// TODO Auto-generated method stub
		iSupplyDAO.deleteById(id);
	}

}
