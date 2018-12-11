package com.junesoft.iod.sample.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.junesoft.iod.sample.dao.VersionDAO;
import com.junesoft.iod.sample.dao.VersionDTO;
import com.junesoft.iod.sample.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {
	@Inject
	private VersionDAO versionDAO;

	@Override
	public List<VersionDTO> selectVersionList() throws Exception {
		return versionDAO.selectVersionList();
	}

}
