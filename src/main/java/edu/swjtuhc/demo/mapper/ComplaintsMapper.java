package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.ComplaintsModel;

@Mapper
public interface ComplaintsMapper {
	public int inserInformation(ComplaintsModel complaintmodel);
}
