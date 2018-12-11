package com.junesoft.iod.sample.web;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.junesoft.iod.sample.dao.VersionDTO;
import com.junesoft.iod.sample.service.SampleService;

@Controller
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	@Inject
	private SampleService service;

	@RequestMapping(value = "/iodDemo/{pageType}/{pageVariable}", method = RequestMethod.GET)
	public String iodDemo(@PathVariable String pageType, @PathVariable String pageVariable, Locale locale, Model model, HttpServletRequest request) throws Exception {
		logger.debug("This is JUNESOFTWARE IOD PROJECT sample page. [" + request.getRemoteHost() + "]");

		if (pageType == null || "".equals(pageType)) {
			pageType = "iodDemo";
		}
		if (pageVariable == null || "".equals(pageVariable)) {
			pageVariable = "pageVariable is null";
		}

		model.addAttribute("pageVariable", pageVariable);

		List<VersionDTO> versionList = service.selectVersionList();

		model.addAttribute("versionList", versionList);

		return "/iodDemo/" + pageType;
	}

}
