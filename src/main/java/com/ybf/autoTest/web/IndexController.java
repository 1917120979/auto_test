package com.ybf.autoTest.web;

import com.ybf.autoTest.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/statistics")
    public Map<String, String> getStatistics(){
        Map<String,String> map = new HashMap<>();
        String projectNum = projectService.count();
        map.put("projectNum",projectNum);
        return map;
    }
}
