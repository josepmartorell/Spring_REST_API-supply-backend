package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Provider;
import com.crud.sql.service.ProviderServiceImpl;

@RestController
@RequestMapping("/api")
public class ProviderController {
	
	@Autowired
	ProviderServiceImpl providerServiceImpl;
	
	@GetMapping("/providers")
	public List<Provider> listProviders(){
		return providerServiceImpl.listProviders();		
	}
	
	@PostMapping("/providers")
	public Provider saveProvider(@RequestBody Provider provider) {
		return providerServiceImpl.saveProvider(provider);
	}
	
	@GetMapping("/providers/{id}")
	public Provider providerXID(@PathVariable(name="id") int id) {
		Provider provider_xid = new Provider();
		provider_xid = providerServiceImpl.providerXID(id);
		return provider_xid;
	}
	
	@PutMapping("/providers/{id}")
	public Provider updateProvider(@PathVariable(name="id")int id,@RequestBody Provider provider) {
		Provider provider_selected = new Provider();
		Provider provider_updated = new Provider();
		
		provider_selected = providerServiceImpl.providerXID(id);		
		provider_selected.setName(provider.getName());
		
		provider_updated = providerServiceImpl.updateProvider(provider_selected);
		return provider_updated;
	}
	
	@DeleteMapping("/providers/{id}")
	public void eliminateProvider(@PathVariable(name="id") int id) {
		providerServiceImpl.eliminateProvider(id);
	}
	
	
	

}
