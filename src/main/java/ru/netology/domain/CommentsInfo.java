package ru.netology.domain;

public class CommentsInfo {
    private int count; //количество комментариев
    private boolean canPost; //возможность комментировать
    private int dateComment; //дата комментария
    private String textComment; //текст комментария
    private boolean canClose; //возможность закрыть пост от комментариев


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;

    }

    public int getdateComment() {
        return dateComment;
    }

    public void setdateComment(int dateComment) {
        this.dateComment = dateComment;
    }


    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }
}
