package com.simplilearn.demo.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")
@Primary
public class MySqlReportDaoImpl implements ReportDao {
	public MySqlReportDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("MySqlReportDaoImpl :: constructor  ");
	}

	@Override
	public String findData() {
		System.out.println("fetching report form Mysql db...");
		return "Report Data";
	}

}
