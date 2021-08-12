package ru.netology.domain;

public class Post {
    private int id; //идентификатор поста
    private String imageUrl;  //адрес картинки
    private String name;  //имя владельца страницы
    private int date;  //дата поста
    private String bodyText; //текст поста
    private CommentsInfo commentsInfo; //комментарии
    private LikesInfo likesInfo; //лайки
    private ViewsInfo viewsInfo; //просмотры

    public void getId() {
        this.id = id;

    }

    public String getImageUrl() {
        return imageUrl;

    }

    public String getName() {
        return name;

    }

    public void getDate() {
        this.date = date;

    }

    public String getBodyText() {
        return bodyText;

    }

    public void getCommentsInfo() {
        this.commentsInfo = commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }


    public void getLikesInfo() {
        this.likesInfo = likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public void getViewsInfo() {
        this.viewsInfo = viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

}








