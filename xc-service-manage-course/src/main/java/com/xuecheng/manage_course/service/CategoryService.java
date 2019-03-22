package com.xuecheng.manage_course.service;

import com.xuecheng.framework.domain.course.ext.CategoryNode;
import com.xuecheng.manage_course.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by RookieWangZhiWei on 2019/3/22.
 */
@Service
public class CategoryService {


    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryNode findList() {
        return categoryMapper.selectList();
    }
}
