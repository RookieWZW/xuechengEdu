package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by RookieWangZhiWei on 2019/6/17.
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite,String>{
}
