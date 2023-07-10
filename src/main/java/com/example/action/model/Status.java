package com.example.action.model;

public enum Status {
    CREATED(0),
    STARTED(1),
    STOPPED(2);

    private int statusId;

    Status(int statusNumber) {
        this.statusId = statusNumber;
    }

    public int getStatusNumber() {
        return statusId;
    }
}