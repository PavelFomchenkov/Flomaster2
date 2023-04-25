package com.flomaster2;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {

    private List<String> rockMusicList = new ArrayList<>();

    public void setRockMusicList(List<String> rockMusicList) {
        this.rockMusicList = rockMusicList;
    }

    @Override
    public List<String> getMusicList() {
        return rockMusicList;
    }
}
