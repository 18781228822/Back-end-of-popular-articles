package edu.swjtuhc.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.DeleteMapper;
import edu.swjtuhc.demo.model.DeleteModel;
import edu.swjtuhc.demo.service.DeleteService;

@Service
public class DeleteServiceImpl implements DeleteService{
	@Autowired
	DeleteMapper deletemapper;
	@Override
	public int deleteinformation(DeleteModel deletemodel) {
		// TODO Auto-generated method stub
		int i = deletemapper.DeleteByAid(deletemodel);
		return i;
}

}
