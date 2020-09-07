package com.ybf.autoTest.web;

import com.ybf.autoTest.pojo.Project;
import com.ybf.autoTest.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("projects")
    public List<Project> list() throws Exception{
        return projectService.list();
    }
}
