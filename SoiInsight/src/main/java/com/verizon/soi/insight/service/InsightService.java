package com.verizon.soi.insight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.soi.insight.Respository.InsightRepository;
import com.verizon.soi.insight.model.SOIInsight;

@Service
public class InsightService {

	@Autowired
	private InsightRepository insightRepo;
	
	public List<SOIInsight> getAllInsights()
	{
		return insightRepo.findAll();
	}
}
