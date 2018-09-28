package com.forum.test;

import com.forum.bean.ForumPost;
import com.forum.bean.ForumReply;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by xiaofei on 2017/5/26.
 */
public class ForumTest{

    private static Session session = null;
    private Transaction trans = null;

    /**
     * 发送论坛话题和评论
     * @throws Exception
     */
    public void addForumPost() throws Exception{

        ForumPost post = new ForumPost();
        post.setPostContent("今天我心情很不好，昨天晚上没有睡着！！！");
        post.setPostName("x心情不好");

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date time=null;
        time= sdf.parse(sdf.format(new Date()));
        System.out.println(String.valueOf(new Date()));
        System.out.println(time);
        post.setPostTime(time);

        ForumReply reply1= new ForumReply();
        reply1.setReplyContent("怎么大半夜不睡觉？在干嘛");
        reply1.setReplyTime(time);

        ForumReply reply2= new ForumReply();
        reply2.setReplyContent("年轻人注意身体，这样可不好！！！");
        reply2.setReplyTime(time);

        post.getReplys().add(reply1);
        post.getReplys().add(reply2);

        reply1.setPost(post);
        reply2.setPost(post);

        session= Connection.getSession();
        trans = session.beginTransaction();
        try{
            session.save(post);
            trans.commit();
        }catch(HibernateException e){
            trans.rollback();
            e.printStackTrace();
        }
        session.close();
        Connection.sessionFactoryClose();
    }

    /**
     * 获取论坛内容和评论
     * @throws Exception
     */
    public void loadForumPost() throws Exception{

        session= Connection.getSession();
        trans = session.beginTransaction();
        try{
            ForumPost post=(ForumPost)session.get(ForumPost.class, 2);
            System.out.println("post name:"+post.getPostName()+",reply count:"+post.getReplys().size());
            trans.commit();

        }catch(HibernateException e){
            trans.rollback();
            e.printStackTrace();
        }
        session.close();
        Connection.sessionFactoryClose();
    }

    /**
     * 获取所有的发帖
     * @throws Exception
     */
    public void loadAllForumPosts() throws Exception{

        session= Connection.getSession();
        trans = session.beginTransaction();
        try{
            String hql="from ForumPost f  order by f.postId desc";
            List<ForumPost> forumPostList=session.createQuery(hql).list();
            System.out.println("当前发帖 post list count==:"+forumPostList.size());
            trans.commit();
        }catch(HibernateException e){
            trans.rollback();
            e.printStackTrace();
        }
        session.close();
        Connection.sessionFactoryClose();
    }

    /**
     * 修改帖子标题
     * @throws Exception
     */
    public void updateForumPost() throws Exception{

        session= Connection.getSession();
        trans = session.beginTransaction();
        try{
            ForumPost post=(ForumPost)session.get(ForumPost.class, 2);
            post.setPostName(post.getPostName()+"~bacdefg");

            Set<ForumReply> replys = post.getReplys();
            for(ForumReply reply:replys)
                reply.setReplyContent(reply.getReplyContent()+"123456");

            session.saveOrUpdate(post);
            trans.commit();

        }catch(HibernateException e){
            trans.rollback();
            e.printStackTrace();
        }
        session.close();
        Connection.sessionFactoryClose();
    }

    /**
     * 删除论坛发帖和发帖回复
     * @throws Exception
     */
    public void removeForumPost() throws Exception{

        session= Connection.getSession();
        trans = session.beginTransaction();
        try{
            ForumPost post=(ForumPost)session.load(ForumPost.class, 1);
            session.delete(post);
            trans.commit();

        }catch(HibernateException e){
            trans.rollback();
            e.printStackTrace();
        }
        session.close();
        Connection.sessionFactoryClose();
    }

    /**
     * 删除发帖的回复内容
     * @throws Exception
     */
    public void removeForumReply() throws Exception{

        session= Connection.getSession();
        trans = session.beginTransaction();
        try{
            ForumPost post=(ForumPost)session.get(ForumPost.class, 3);
            ForumReply reply = (ForumReply)post.getReplys().toArray()[0];

            post.getReplys().remove(reply);
            System.out.println(post.getReplys().size());
            reply.setPost(null);

            session.delete(reply);
            trans.commit();

        }catch(HibernateException e){
            trans.rollback();
            e.printStackTrace();
        }
        session.close();
        Connection.sessionFactoryClose();
    }
}
