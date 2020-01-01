package edu.swjtuhc.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Advise;

@Mapper
public interface FeedbackMapper {
	int insertAdvise(Advise advise);
}
