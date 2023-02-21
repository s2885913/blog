package com.lzr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzr.entity.Article;
import com.lzr.result.JsonResult;
import com.lzr.result.ResultTool;
import com.lzr.service.ArticleService;
import com.lzr.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 15980
* @description 针对表【article】的数据库操作Service实现
* @createDate 2023-02-21 11:03:07
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public JsonResult getList() {
        Article article = articleMapper.selectById(1);
        return ResultTool.success(article);
    }
}




