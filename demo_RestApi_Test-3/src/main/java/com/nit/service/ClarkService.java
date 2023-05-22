package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Clark;
import com.nit.repository.IClarkRepository;

@Service
public class ClarkService implements IClarkRService {

	@Autowired
    private IClarkRepository irepository;
	
	@Override
	public String add(Clark clark) {
		Clark msg=irepository.save(clark);
		return "insert completed "+msg;
	}

	@Override
	public String edit(Clark clark) {
		Clark msg=irepository.save(clark);
		return "edit completed"+ msg;
	}

	@Override
	public String delete(Integer id) {
		irepository.deleteById(id);
		return "this id is deleted";
	}

	@Override
	public List<Clark> showAll() {
		List<Clark> msg=irepository.findAll();
		return  msg;
	}

	
}
