package com.flomaster2;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {

    private List<String> classicalMusicList = new ArrayList<>();

    public void setClassicalMusicList(List<String> classicalMusicList) {
        this.classicalMusicList = classicalMusicList;
    }

    @Override
    public List<String> getMusicList() {
        return classicalMusicList;
    }
}
