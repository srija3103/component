package com.tourist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.entity.Tourist;
import com.tourist.serviceimpl.TouristServiceImpl;
@RestController
@RequestMapping("/tourist")
@CrossOrigin(origins="http://localhost:4200")
public class TouristController {
@Autowired
	private TouristServiceImpl tourservice;
@RequestMapping(method=RequestMethod.GET,value="/gettourist")
	public List<Tourist> getTourist(){
		return  tourservice.getTourist();
}
		@RequestMapping(method=RequestMethod.GET,value="/gettourist/{tid}")
		public Tourist getTourist(@PathVariable int tid){
			return  tourservice.getTourist(tid);
}
		@RequestMapping(method=RequestMethod.POST,value="/settourist")
		public void setTourist(@RequestBody Tourist tourist){
			tourservice.setTourist(tourist);

}
}
