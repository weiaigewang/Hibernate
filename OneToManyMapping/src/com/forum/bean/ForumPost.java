package com.forum.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by xiaofei on 2017/5/26.
 */
public class ForumPost extends com.forum.bean.ValueObject{

    private Integer postId = null;
    private String postName = null;
    private String postContent = null;
    private Date postTime = null;
    // one post may has 0-n replies.
    private Set replys=new HashSet();

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Set getReplys() {
        return replys;
    }

    public void setReplys(Set replys) {
        this.replys = replys;
    }
}
