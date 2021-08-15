package ru.netology.domain;

public class LikesInfo {
    private int countLikes; //количество лайков
    private int idUser;  //идентификатор текущего пользователя
    private boolean canLikeIdUser; //возможность для текущего пользователя поставить лайк
    private boolean canPublishIdUser; //возможность для текущего пользователя сделать репост


    public int getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(int countLikes) {
        this.countLikes = countLikes;
        }

    public boolean isCanLikeIdUser() {
        return canLikeIdUser;
    }

    public boolean isCanPublishIdUser() {
        return canPublishIdUser;
    }
}
