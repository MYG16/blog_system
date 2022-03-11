package com.myg.blog_system.service;

import com.github.pagehelper.PageInfo;
import com.myg.blog_system.model.domain.Comment;

public interface ICommentService {
    // 获取文章下的评论
    public PageInfo<Comment> getComments(Integer aid, int page, int count);

    // 用户发表评论
    public void pushComment(Comment comment);
}
