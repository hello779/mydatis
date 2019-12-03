package com.zking.oa.service.impl.impl;

import com.zking.oa.mapper.StudentMapper;
import com.zking.oa.model.Student;
import com.zking.oa.service.impl.IStudentService;
import com.zking.oa.util.PageBean;
import com.zking.oa.util.PageBeanAspect;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
//@Scope(value = "prototype")
@Service
public class IStudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    public IStudentServiceImpl(){

    }

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public int delAll(Student student) {
        return this.studentMapper.delAll(student);
    }

    @Override
    public List<Student> list(Student student, PageBean pageBean) {
//        if (null != pageBean && pageBean.isPagination()) {
//            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
//        }

     List<Student> studentList=   this.studentMapper.list(student);
        System.out.println(studentList.getClass());
//        if (null != pageBean && pageBean.isPagination()) {
//            PageInfo pageInfo = new PageInfo(studentList);
//            pageBean.setTotal(pageInfo.getTotal()+"");
//        }
        return studentList;
    }

    @Override
    public int add(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int edit(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public int editAge(Student student) {
        Student s=new Student();
        s.setSid(student.getSid());
        s.setAge(student.getAge());
        return studentMapper.updateByPrimaryKeySelective(s);
    }

    @Override
    public int del(Student student) {
        return studentMapper.deleteByPrimaryKey(student.getSid());
    }

    @Override
    public Student load(Student student) {
        return studentMapper.selectByPrimaryKey(student.getSid());
    }



}
