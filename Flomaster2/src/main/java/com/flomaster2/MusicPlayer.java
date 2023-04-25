package com.flomaster2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();
    private List<String> genreList;
    private final Random random = new Random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setGenreList(List<String> genreList) {
        this.genreList = genreList;
    }

    public MusicPlayer() {
    }

    public void musicPlayerInit() {
        System.out.println(this.getName() + ", volume: " + this.getVolume());
    }

    public void playMusicList() {
//        for (String genre: genreList) {
//            System.out.println(genre);
//        }
//        System.out.println("Playing: " + musicList.get(1).getMusicList());
        for (String genre: genreList) {
            for (GENRE genreEnum: GENRE.values()) {
                if(genre.equals(genreEnum.name())) {
                    int randomSong = random.nextInt(musicList.get(genreEnum.ordinal()).getMusicList().size());
                    System.out.println(musicList.get(genreEnum.ordinal()).getMusicList().get(randomSong));
                }
            }
        }

    }

}