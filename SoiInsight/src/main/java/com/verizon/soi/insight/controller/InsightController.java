package com.verizon.soi.insight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.soi.insight.model.SOIInsight;
import com.verizon.soi.insight.service.InsightService;

@RestController
public class InsightController {
	
	
	@Autowired
	InsightService insightService;
	@RequestMapping("/insights")
	public List<SOIInsight> getAllinsight()
	{
		return insightService.getAllInsights();
	}
	

}
