package com.studentmanagement.studentmanagement.controller;


import com.studentmanagement.studentmanagement.model.entity.Report;
import com.studentmanagement.studentmanagement.service.ReportService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "Reports")
@RestController
@RequestMapping("/report")

public class ReportController {
    @Autowired
    ReportService reportService;

    @RequestMapping(value = "/showReports/{reportType}", method = RequestMethod.GET)
    public Report showReport(@PathVariable(value = "reportType") String type){
        return reportService.showReport(type);
    }

}
