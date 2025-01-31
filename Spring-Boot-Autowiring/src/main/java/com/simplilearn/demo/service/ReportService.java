package com.simplilearn.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.dao.ReportDao;
@Service
public class ReportService {
	private ReportDao reportDao;
	
	

	
//	@Autowired
//	@Qualifier("oracle")
//	public void setReportDao(ReportDao reportDao) {
//		System.out.println("setReportDao() :: constructor..");
//		this.reportDao = reportDao;
//	}
	public ReportService(ReportDao reportDao) {
		// TODO Auto-generated constructor stub
		this.reportDao=reportDao;
	}
	public void genrateReport() {
		reportDao.findData();
		System.out.println("genrating report... ");
	}
}
