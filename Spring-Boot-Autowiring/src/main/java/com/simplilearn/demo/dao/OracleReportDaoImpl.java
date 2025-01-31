package com.simplilearn.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao {
	public OracleReportDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("OracleReportDaoImpl :: constructor  ");
	}

	@Override
	public String findData() {
		System.out.println("fetching report form oracle db...");
		return "Report Data";
	}

}
