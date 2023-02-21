package com.lzr.mapper;

import com.lzr.entity.domain.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author 15980
* @description 针对表【article】的数据库操作Mapper
* @createDate 2023-02-21 11:03:07
* @Entity com.lzr.entity.domain.Article
*/
@Repository
public interface ArticleMapper extends BaseMapper<Article> {

}




