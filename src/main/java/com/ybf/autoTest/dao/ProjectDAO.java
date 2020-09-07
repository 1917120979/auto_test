package com.ybf.autoTest.dao;

import com.ybf.autoTest.pojo.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDAO extends JpaRepository<Project,Integer> {
}
