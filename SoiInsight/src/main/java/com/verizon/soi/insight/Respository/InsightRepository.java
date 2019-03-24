package com.verizon.soi.insight.Respository;



import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.verizon.soi.insight.model.SOIInsight;

public interface InsightRepository extends CassandraRepository<SOIInsight, Long> {
	
	List<SOIInsight> findAll();
	


}
