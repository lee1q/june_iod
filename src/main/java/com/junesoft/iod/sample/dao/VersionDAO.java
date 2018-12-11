package com.junesoft.iod.sample.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class VersionDAO {
	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.junesoft.mapper.versionMapper";

	public List<VersionDTO> selectVersionList() throws Exception {
		return sqlSession.selectList(Namespace + ".selectVersionList");
	}

}
