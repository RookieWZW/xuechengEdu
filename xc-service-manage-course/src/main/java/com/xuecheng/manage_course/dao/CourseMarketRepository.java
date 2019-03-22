package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CourseMarket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by RookieWangZhiWei on 2019/3/22.
 */
public interface CourseMarketRepository extends JpaRepository<CourseMarket, String> {
}