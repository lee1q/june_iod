package com.junesoft.iod.sample.service;

import java.util.List;

import com.junesoft.iod.sample.dao.VersionDTO;

public interface SampleService {
	
	public List<VersionDTO> selectVersionList() throws Exception;

}
