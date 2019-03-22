package com.xuecheng.manage_course.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by RookieWangZhiWei on 2019/3/22.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class CourseMapperTest {


     @Autowired
     private CourseMapper courseMapper;

     @Test
     public void testPageHelper(){
         PageHelper.startPage(2,1);
         CourseListRequest courseListRequest = new CourseListRequest();

         Page<CourseInfo> courseInfoPage = courseMapper.findCourseListPage(courseListRequest);
         List<CourseInfo> result = courseInfoPage.getResult();

         System.out.println(courseInfoPage);

         System.out.println(result);
     }
}