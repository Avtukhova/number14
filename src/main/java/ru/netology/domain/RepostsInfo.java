package ru.netology.domain;

public class RepostsInfo {
    private int countCopy; //число пользователей, скопировавших запись

    public int getCountCopy() {
        return countCopy;
    }

    public void setCountCopy(int countCopy) {
        this.countCopy = countCopy;
    }
}
