package com.tourist.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourist.entity.Tourist;
import com.tourist.repository.TouristRepository;
import com.tourist.service.TouristService;
@Service
public class TouristServiceImpl implements TouristService {

	@Autowired
	private TouristRepository trepo;

	@Override
	public List<Tourist> getTourist() {
		// TODO Auto-generated method stub
		return (List<Tourist>) trepo.findAll();
	}

	@Override
	public Tourist getTourist(int tid) {
		// TODO Auto-generated method stub
		return trepo.findById(tid).get();
	}

	@Override
	public void setTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		trepo.save(tourist);
	}
}