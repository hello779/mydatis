package com.zking.oa.service.impl;

import com.zking.oa.mapper.StudentMapper;
import com.zking.oa.model.Student;
import com.zking.oa.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IStudentService {

    int add(Student student);

    int edit(Student student);

    int editAge(Student student);

    int del(Student student);

    int delAll(Student student);

    @Transactional(readOnly = true)
    Student load(Student student);

    @Transactional(readOnly  = true)
    List<Student> list(Student student, PageBean pageBean);

}
