package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by RookieWangZhiWei on 2019/2/25.
 */
public interface CmsConfigRepository  extends MongoRepository<CmsConfig,String>{

}
