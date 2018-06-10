package com.travelNotes.entity;

import java.util.List;

/**
 * Created by asus on 2018/6/3.
 */

public class NotesDetail {
    private String noteImageUrl; //文章图片url
    private String noteTitle;  //文章标题
    private String noteContent;  //文章内容
    private String userPhoto;    //文章发布者头像
    private String userNickname; //发布者昵称
    private String commentNum;  //评论数
    private String collectionNum;  //收藏数
    private Integer DayOfWeek;   //星期几
    private String publishTime;   //发布时间
    private List<String> lableList;  //文章标签
    private Integer dayAgo;   //几天前

    public String getNoteImageUrl() {
        return noteImageUrl;
    }

    public void setNoteImageUrl(String noteImageUrl) {
        this.noteImageUrl = noteImageUrl;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getCollectionNum() {
        return collectionNum;
    }

    public void setCollectionNum(String collectionNum) {
        this.collectionNum = collectionNum;
    }

    public Integer getDayOfWeek() {
        return DayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        DayOfWeek = dayOfWeek;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public List<String> getLableList() {
        return lableList;
    }

    public void setLableList(List<String> lableList) {
        this.lableList = lableList;
    }

    public Integer getDayAgo() {
        return dayAgo;
    }

    public void setDayAgo(Integer dayAgo) {
        this.dayAgo = dayAgo;
    }
}
