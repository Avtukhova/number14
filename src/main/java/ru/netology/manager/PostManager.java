package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {
    private Post[] posts;

    private int idOwner;  // идентификатор пользователя или сообщества
    private String address; // адрес пользователя или сообщества
    private String query; // поисковый запрос
    private boolean idOwnersOnly;  // записи только данного пользователя
    private int count;  // количество записей, соответствующих запросу
    private int idPost;  // идентификатор записи



    public Post[] searchPostIdOwner() {
        // add logic
        return null;
    }

    public Post[] searchAddress() {
        // add logic
        return null;
    }

    public Post[] searchQuery() {
        // add logic
        return null;
    }

    public Post[] searchIdOwnersOnly() {
        // add logic
        return null;
    }

    public Post[] searchCount() {
        // add logic
        return null;
    }

    public Post[] searchIdPost() {
        // add logic
        return null;
    }

    public void deleteIdOwnersOnly() {
        // add logic

    }

}

