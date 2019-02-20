package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * Created by RookieWangZhiWei on 2019/2/20.
 */
@Api(value = "cms页面管理接口",description = "cms页面管理接口，提供页面的增删改查")
public interface CmsPageControllerApi {

    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "页面",required = true,paramType = "path",dataType = "int"),
            @ApiImplicitParam(name = "size",value = "每页记录数",required = true,paramType = "path",dataType = "int")
    })
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
