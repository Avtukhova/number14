package ru.netology.domain;

public class PostManager {
    private int id; //идентификатор поста
    private String imageUrl;  //адрес картинки
    private String name;  //имя владельца страницы
    private int date;  //дата поста
    private String bodyText; //текст поста
    private CommentsInfo commentsInfo; //комментарии
    private LikesInfo likesInfo; //лайки
    private ViewsInfo viewsInfo; //просмотры
    private RepostsInfo repostsInfo; //репосты
    private int idOwner;  //идентификатор владельца стены
    private int idReplyOwner; //идентификатор ответа владельца стены
    private int idReplyPost; //идентификатор ответа на пост
    private int friendsOnly; //только для друзей
    private Post[] search;
    private Post[] delete;

}
