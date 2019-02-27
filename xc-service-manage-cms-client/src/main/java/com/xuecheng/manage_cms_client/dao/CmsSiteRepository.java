package com.xuecheng.manage_cms_client.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by RookieWangZhiWei on 2019/2/26.
 */
public interface CmsSiteRepository  extends MongoRepository<CmsSite,String>{
}
