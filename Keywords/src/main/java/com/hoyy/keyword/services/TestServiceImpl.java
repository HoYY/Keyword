package com.hoyy.keyword.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hoyy.keyword.models.TestVO;
import com.hoyy.keyword.repositories.TestDAO;

@Service
public class TestServiceImpl implements TestService {
	
	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestVO> selectTest() {
		try {
			return dao.selectTest();
		}
		catch(Exception e) {
			System.out.println("TestService : " + e);
			return null;
		}
	}

}
