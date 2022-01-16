package com.davidchoi.vocaApi.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.davidchoi.vocaApi.dao.VocaDAO;
import com.davidchoi.vocaApi.dto.VocaDTO;

@RestController
@RequestMapping("/word")
public class DBConnectController {
	
	@Autowired
	private VocaDAO vocaDAO;
	
	@GetMapping("/all")
	public List<VocaDTO> getVocaList(){
		return vocaDAO.getVocaList();
	}
	
	@GetMapping("/{id}")
	public List<VocaDTO> getVocaById(@PathVariable("id")String id){
		return vocaDAO.getVocaById(id);
	}

}
