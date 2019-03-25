package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CoursePic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by RookieWangZhiWei on 2019/3/25.
 */
public interface CoursePicRepository extends JpaRepository<CoursePic, String> {

    //删除成功返回1否则返回0
    long deleteByCourseid(String courseId);
}
