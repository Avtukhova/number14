package ru.netology.domain;

public class CommentsInfo {
    private int count; //количество комментариев
    private boolean canPost; //возможность комментировать
    private int dateComment; //дата комментария
    private String textComment; //текст комментария
    private boolean canClose; //возможность закрыть пост от комментариев
    private boolean canOpen; //возможность открыть пост для комментариев


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;

    }

    public int getDateComment() {
        return dateComment;
    }

    public void setDateComment(int dateComment) {
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

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }
}
