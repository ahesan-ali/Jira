package com.jira.genai.jira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JiraRestClientController {

    @GetMapping("/jira")
    public String getJiraNames(){
        return "SCRUM1";
    }
}
