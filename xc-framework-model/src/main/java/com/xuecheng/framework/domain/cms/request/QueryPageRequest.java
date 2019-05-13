package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-12 14:59
 **/
@Data
public class QueryPageRequest {

    @ApiModelProperty("站点Id")
    private String siteId;
    @ApiModelProperty("页面Id")
    private String pageId;
    @ApiModelProperty("页面名称")
    private String pageName;
    @ApiModelProperty("页面别名")
    private String pageAliase;
    @ApiModelProperty("模板Id")
    private String templateId;

    private String pageType;
}
