package com.cooper.controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.sql.Clob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.validation.Valid;

import org.hibernate.LockMode;
 
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.StatelessSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

 
import com.cooper.daoracle.FICXINTRepository;
import com.cooper.daoracle.UserRepository;
import com.cooper.entities.DataTable;
import com.cooper.entities.FICXINT;
 

import org.springframework.data.domain.Page;
 
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.http.ResponseEntity;
 
 
@Controller
public class SagetoEgoController2 {

	@Autowired
	FICXINTRepository fICXINTRepository;
 	
	@Autowired
	UserRepository userRepository;
	
    @GetMapping(value = "/api/users")
    public @ResponseBody DataTablesOutput<FICXINT> User(@Valid DataTablesInput input) {
        return userRepository.findAll(input);
    }
	
	@RequestMapping(value = "/index/list")
	public ResponseEntity listAllTable(@RequestParam("draw") int draw,
	                                  @RequestParam("start") int start,
	                                  @RequestParam("size") int size) {
	    //int page = start / size; //Calculate page number
	    int page=0;
	    size=5;
	    //int draw = 0; 
	    Pageable pageable = PageRequest.of(page, size); 
	    Page<FICXINT> responseData = fICXINTRepository.findAll(pageable);
	    DataTable dataTable = new DataTable();
	    dataTable.setData(responseData.getContent());
	    dataTable.setRecordsTotal(responseData.getTotalElements());
	    dataTable.setRecordsFiltered(responseData.getTotalElements());
	    dataTable.setDraw(draw);
	    dataTable.setStart(start);

	    return ResponseEntity.ok(dataTable);

	}
	
//	@RequestMapping(value = "/index1",method = RequestMethod.GET)
//	public String index1(Model model)
//		{
//	
//			List<FICXINT> ListFICXINTErreur = fICXINTRepository.findAll();
//			model.addAttribute("ListFICXINTErreur", ListFICXINTErreur);
//			return "index";		
//	
//	}
		
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String OutWMS(Model model,		 
						@RequestParam(name = "page", defaultValue = "0") int p,
						@RequestParam(name = "size", defaultValue = "5") int s )
		{
	
		Pageable firstPage = PageRequest.of(p, s); 		 
	    //Page<FICXINT> ListFICXINTErreur = fICXINTRepository.ListFICXINTErreurPage(firstPage);	
	    String test="hello";
		Page<FICXINT> ListFICXINTErreur = fICXINTRepository.findAll(firstPage);	
		model.addAttribute("ListFICXINTErreur", ListFICXINTErreur.getContent());
		int[] pages = new int[ListFICXINTErreur.getTotalPages()];
		 
		model.addAttribute("pages", pages);
		model.addAttribute("size", s);
		model.addAttribute("pagecourante", p);
		return "index";
	 
 
	
	//Page<FICXINT> ListFICXINTErreur = fICXINTRepository.ListFICXINTErreurPage(firstPage);		 
//	//List<FICXINT> ListFICXINTErreur = fICXINTRepository.ListFICXINTErreur();
//	//model.addAttribute("ListFICXINTErreur", ListFICXINTErreur);
//	//return "index";		
	
	}
	
	
	@RequestMapping(value = "/")
	public String home() {
		return ("redirect:/index");
	}
		 
}
