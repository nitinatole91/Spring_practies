package com.simplilearn.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements ReportDao {
	public ReportDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("ReportDaoImpl :: constructor  ");
	}

	@Override
	public String findData() {
		System.out.println("fetching report form db...");
		return "Report Data";
	}

}
