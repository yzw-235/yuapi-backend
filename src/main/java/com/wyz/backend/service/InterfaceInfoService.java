package com.wyz.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyz.backend.model.entity.InterfaceInfo;
import com.wyz.backend.model.entity.Post;


/**
* @author Administrator
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-09-02 13:49:22
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add 是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
