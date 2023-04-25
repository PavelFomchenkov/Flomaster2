package com.flomaster2;

import java.util.ArrayList;
import java.util.List;

public class PopMusic implements Music {
    private List<String> popMusicList = new ArrayList<>();

    public void setPopMusicList(List<String> popMusicList) {
        this.popMusicList = popMusicList;
    }

    @Override
    public List<String> getMusicList() {
        return popMusicList;
    }
}


