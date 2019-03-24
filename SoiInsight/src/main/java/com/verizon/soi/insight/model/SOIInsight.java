package com.verizon.soi.insight.model;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(value="SOI_INSIGHTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SOIInsight {

	@PrimaryKeyColumn(name = "ACCT_NO",ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	long acctNo;

	@PrimaryKeyColumn(name = "MTN", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	long mtn;

	@Column(value = "CREATE_TS")
	String createTs;

	@Column(value = "INSIGHT_CATEGORY")
	String insightCategory;
	
	@Column(value = "INSIGHT_TYPE")
	String insightType;
	
	@Column(value = "INSIGHT_VALUE")
	String insightValue;
	
	@Column(value = "LAST_MODIFIED_TS")
	String lastModifiedTs;

}
