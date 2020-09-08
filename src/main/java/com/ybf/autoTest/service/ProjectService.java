package com.ybf.autoTest.service;

import com.ybf.autoTest.dao.ProjectDAO;
import com.ybf.autoTest.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectDAO projectDAO;

    public List<Project> list(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        return projectDAO.findAll(sort);
    }

}
