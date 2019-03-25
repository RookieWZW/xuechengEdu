package com.xuecheng.api.filesystem;

import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by RookieWangZhiWei on 2019/3/25.
 */
public interface FileSystemControllerApi {


    public UploadFileResult upload(MultipartFile multipartFile,String filetag,String businessKey,String metadata);
}
