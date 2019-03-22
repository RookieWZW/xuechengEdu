package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.system.SysDictionary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RookieWangZhiWei on 2019/3/22.
 */
@Repository
public interface SysDictionaryRepository extends MongoRepository<SysDictionary, String> {

    //根据字典分类查询字典信息
    SysDictionary findByDType(String dType);
}
