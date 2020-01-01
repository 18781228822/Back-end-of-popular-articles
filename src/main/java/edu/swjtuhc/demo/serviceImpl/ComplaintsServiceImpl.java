package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.ComplaintsMapper;
import edu.swjtuhc.demo.model.ComplaintsModel;
import edu.swjtuhc.demo.service.ComplaintsService;

@Service
public class ComplaintsServiceImpl implements ComplaintsService{
	@Autowired
	ComplaintsMapper complaintsmapper;
	@Override
	public int WritetInformation(ComplaintsModel complaintsmodel) {
		// TODO Auto-generated method stub\
		int i= complaintsmapper.inserInformation(complaintsmodel);
		return i;
	}

}
