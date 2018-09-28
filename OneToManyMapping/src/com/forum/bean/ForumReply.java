package com.forum.bean;

import java.util.Date;

/**
 * Created by xiaofei on 2017/5/26.
 */
public class ForumReply extends ValueObject {

    private Integer replyId = null;
    private String replyContent = null;
    private Date replyTime = null;
    private ForumPost post = null;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public ForumPost getPost() {
        return post;
    }

    public void setPost(ForumPost post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object obj) {
        ForumReply otherReply =(ForumReply)obj;
        return this.replyId.equals(otherReply.replyId);
    }
}
