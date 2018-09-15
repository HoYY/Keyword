package com.hoyy.keyword.repositories;

import java.util.List;

import javax.inject.Inject;
 
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
 
import com.hoyy.keyword.models.TestVO;

@Repository
public class TestDAOImpl implements TestDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.hoyy.keyword.mappers.testMapper";
	
	@Override
	public List<TestVO> selectTest() {
		try {
			return sqlSession.selectList(Namespace+".selectTest");
		}
		catch(Exception e) {
			System.out.println("TestDAO : " + e);
			return null;
		}
	}
}
