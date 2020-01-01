package edu.swjtuhc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.model.ComplaintsModel;
import edu.swjtuhc.demo.model.DeleteModel;
import edu.swjtuhc.demo.service.DeleteService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Delete")
public class DeleteController {
	@Autowired
	DeleteService deleteservice;
	@RequestMapping("/delete")
	public JSONObject  discover(@RequestBody DeleteModel deletemodel) {
		System.out.println(deletemodel);
		JSONObject requesMap = new JSONObject();
		int i = deleteservice.deleteinformation(deletemodel);
		System.out.println(deletemodel);
		requesMap.put("state",i);
		return requesMap;
	}
}
