package com.ex.firstapp;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Player {
    Integer number;
    String name;
    ArrayList<Integer> points;

    public Player(Integer number, String name, ArrayList<Integer> points) {
        this.number = number;
        this.name = name;
        this.points = points;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
