package com.webapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.demo.dao.TravellistDao;
import com.webapp.demo.Travelapp.TravelClass;



@RestController
public class TravelController {
	@Autowired
	TravellistDao dao;
	@RequestMapping("/addTravel")
	@ResponseBody
	public void addTravel(@RequestParam int id,String tname,String description,TravelClass obj) {
		
		obj.setId(id);
		obj.setName(tname);
		obj.setDescription(description);
		dao.save(obj);
		
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<TravelClass> getAll() {
		
		return dao.findAll();
	}
	
	@RequestMapping("/listById")
	@ResponseBody
	public List<TravelClass> ById(@RequestParam int id) {
		System.out.println("list by id");
		return dao.listById(id);
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public void updateTravel(@RequestParam int id,@RequestParam String description) {
		
		System.out.println("travel desc updated");
		dao.update(id,description);
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public void deleteList(@RequestParam int id) {
		
		System.out.println("series deleted");
		dao.deleteById(id);
		
	}

	

}