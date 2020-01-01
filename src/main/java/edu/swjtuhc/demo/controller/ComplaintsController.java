package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.ComplaintsModel;
import edu.swjtuhc.demo.service.ComplaintsService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Complaints")
public class ComplaintsController {
	@Autowired
	ComplaintsService complaintsservice;
	
	
	@RequestMapping("/injection")
	public JSONObject  insert(@RequestBody ComplaintsModel complaintmodel) {
		System.out.println(complaintmodel);
		JSONObject requesMap = new JSONObject();
		
		int i = complaintsservice.WritetInformation(complaintmodel);
		System.out.println(complaintmodel);
		requesMap.put("state",i);
		return requesMap;
	}
}
