package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.DeleteModel;

@Mapper
public interface DeleteMapper{
	public int DeleteByAid(DeleteModel deletemodelr);
}
