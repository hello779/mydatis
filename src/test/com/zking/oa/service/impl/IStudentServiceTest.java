package com.zking.oa.service.impl;

import com.zking.oa.model.Student;
import com.zking.oa.service.impl.BaseTest;
import com.zking.oa.service.impl.IStudentService;
import org.apache.logging.log4j.core.util.Loader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Locale;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class IStudentServiceTest extends BaseTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private IStudentService studentService;
    private Student student;

//@Before
//    public void before(){
//        super.before();
//        this.student=new Student();
//    }


    @Override
    public void before() {
        super.before();
        this.student=new Student();
    }

    @Test
    public void add() throws Exception {
//        student.setSid();
        student.setSname("抵扣积分");
        student.setAge(23);
        student.setRemark("jkdkjkd");

        this.studentService.add(student);

        System.out.println(student.getSid());
    }

    @Test
    public void update() throws Exception {
        student.setSid(1);
        student.setSname("见到你");
        student.setAge(45);
        student.setRemark("到家了空间");
        this.studentService.edit(student);
    }

    @Test
    public void del() throws Exception {
        student.setSid(5);
        this.studentService.del(student);
    }

    @Test
    public void delAll() throws Exception {
        student.setSids(new Integer[]{1,3});
        this.studentService.delAll(student);
    }

    @Test
    public void load() throws Exception {
        student.setSid(6);
        Student s=studentService.load(student);
        System.out.println(s);
//        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
//        s=studentService.load(student);
//        System.out.println(s);
    }

    @Test
    public void list() throws Exception {
//        student.setSname("见");
//        student.setMaxAge(23);
//        student.setMinAge(19);
//        PageBean pageBean=new PageBean();

        pageBean.setPage(1);
        pageBean.setRows(4);
        List<Student> studentList=studentService.list(student,pageBean);
        System.out.println(studentList.size());
        System.out.println("nnnnnnnnnnnnnnnnnnnnnnnn");
        studentList=studentService.list(student,pageBean);
        System.out.println(studentList.size());

//        for(Student s: studentList){
//            System.out.println(s);
//        }
    }

    @Test
    public void  test(){
        redisTemplate.opsForValue().set("uname","zs");
    }
    @Test
    public void  test3(){

        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
    }

}