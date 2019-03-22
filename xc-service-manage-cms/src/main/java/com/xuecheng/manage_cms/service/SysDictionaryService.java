package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.system.SysDictionary;
import com.xuecheng.manage_cms.dao.SysDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by RookieWangZhiWei on 2019/3/22.
 */
@Service
public class SysDictionaryService {


    @Autowired
    private SysDictionaryRepository sysDictionaryRepository;


    //根据字典分类type查询字典信息
    public SysDictionary findDictionaryByType(String type) {
        return sysDictionaryRepository.findByDType(type);
    }
}
