package com.lzr.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName article
 */
@TableName(value ="article")
@Data
public class Article implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 封面图片
     */
    private String articleImg;

    /**
     * 标题
     */
    private String articleTitle;

    /**
     * 内容
     */
    private String articleContent;

    /**
     * 浏览量
     */
    private Integer articleViews;

    /**
     * 是否可见(1是，0否)
     */
    private Integer isVisible;

    /**
     * 是否置顶(1是，0否)
     */
    private Integer isTop;

    /**
     * 是否开启评论(1是，0否)
     */
    private Integer isComment;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Integer createBy;

    /**
     * 修改人
     */
    private Integer updateBy;

    /**
     * 分类id
     */
    private Integer sortId;

    /**
     * 逻辑删除(1已删除，0未删除)
     */
    private Integer delFlag;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getArticleImg() == null ? other.getArticleImg() == null : this.getArticleImg().equals(other.getArticleImg()))
            && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
            && (this.getArticleContent() == null ? other.getArticleContent() == null : this.getArticleContent().equals(other.getArticleContent()))
            && (this.getArticleViews() == null ? other.getArticleViews() == null : this.getArticleViews().equals(other.getArticleViews()))
            && (this.getIsVisible() == null ? other.getIsVisible() == null : this.getIsVisible().equals(other.getIsVisible()))
            && (this.getIsTop() == null ? other.getIsTop() == null : this.getIsTop().equals(other.getIsTop()))
            && (this.getIsComment() == null ? other.getIsComment() == null : this.getIsComment().equals(other.getIsComment()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getSortId() == null ? other.getSortId() == null : this.getSortId().equals(other.getSortId()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getArticleImg() == null) ? 0 : getArticleImg().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getArticleContent() == null) ? 0 : getArticleContent().hashCode());
        result = prime * result + ((getArticleViews() == null) ? 0 : getArticleViews().hashCode());
        result = prime * result + ((getIsVisible() == null) ? 0 : getIsVisible().hashCode());
        result = prime * result + ((getIsTop() == null) ? 0 : getIsTop().hashCode());
        result = prime * result + ((getIsComment() == null) ? 0 : getIsComment().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getSortId() == null) ? 0 : getSortId().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", articleImg=").append(articleImg);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", articleViews=").append(articleViews);
        sb.append(", isVisible=").append(isVisible);
        sb.append(", isTop=").append(isTop);
        sb.append(", isComment=").append(isComment);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", sortId=").append(sortId);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}