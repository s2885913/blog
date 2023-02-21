package com.lzr.service;

import com.lzr.entity.domain.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lzr.result.JsonResult;

/**
* @author 15980
* @description 针对表【article】的数据库操作Service
* @createDate 2023-02-21 11:03:07
*/
public interface ArticleService extends IService<Article> {
    public JsonResult getList();

}
