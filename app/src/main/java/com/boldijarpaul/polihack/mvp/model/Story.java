package com.boldijarpaul.polihack.mvp.model;

import android.graphics.Color;

import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class Story extends BaseObject implements Serializable {

    private int userId;
    public String name;
    public String color;

    public double lat,lng;

    public List<Quest> quests;

    public int getColor() {
        return randomColor();
    }

    private static Random sRandom;

    public static synchronized int randomColor() {
        if (sRandom == null) {
            sRandom = new Random();
        }
        return 0xff000000 + 256 * 256 * sRandom.nextInt(256) + 256 * sRandom.nextInt(256)
                + sRandom.nextInt(256);
    }
}