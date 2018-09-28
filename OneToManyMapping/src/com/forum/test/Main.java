package com.forum.test;

import com.forum.bean.ForumPost;

/**
 * Created by xiaofei on 2017/5/26.
 */
public class Main {

    public static void main(final String[] args) throws Exception {


        ForumTest forumTest = new ForumTest();
        forumTest.addForumPost();
        //forumTest.loadForumPost();
        //forumTest.loadAllForumPosts();
        //forumTest.updateForumPost();
        //forumTest.removeForumPost();
        //forumTest.removeForumReply();

        ForumPost forumPost = new ForumPost();
        forumPost.getPostName().startsWith("你好");//以你好打头
    }
}