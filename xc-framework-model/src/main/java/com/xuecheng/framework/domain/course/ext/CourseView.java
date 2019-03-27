package com.xuecheng.framework.domain.course.ext;

import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.CourseMarket;
import com.xuecheng.framework.domain.course.CoursePic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by RookieWangZhiWei on 2019/3/27.
 */
@Data
@ToString
@NoArgsConstructor
public class CourseView implements Serializable {

    CourseBase courseBase;
    CourseMarket courseMarket;

    CoursePic coursePic;

    TeachplanNode teachplanNode;

}
