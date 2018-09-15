package com.hoyy.keyword.repositories;

import java.util.List;

import com.hoyy.keyword.models.TestVO;

public interface TestDAO {
	
	public List<TestVO> selectTest() throws Exception;
	
}
