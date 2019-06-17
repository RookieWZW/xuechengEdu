package com.xuecheng.api.filesystem;

import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by RookieWangZhiWei on 2019/3/25.
 */
public interface FileSystemControllerApi {


    /**
     * 上传文件
     * @param multipartFile 文件
     * @param filetag 文件标签
     * @param businesskey 业务key
     * @param metedata 元信息,json格式
     * @return
     */
    public UploadFileResult upload(MultipartFile multipartFile,String filetag,String businessKey,String metadata);
}
