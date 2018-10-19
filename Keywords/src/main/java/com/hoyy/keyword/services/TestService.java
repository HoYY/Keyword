package com.hoyy.keyword.services;

import java.util.List;

import com.hoyy.keyword.models.TestVO;

public interface TestService {

	public List<TestVO> selectTest() throws Exception;
	
}
