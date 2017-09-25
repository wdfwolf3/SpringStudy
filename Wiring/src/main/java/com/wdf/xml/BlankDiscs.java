package com.wdf.xml;

import com.wdf.auto.CompactDisc;

import java.util.List;

public class BlankDiscs implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDiscs(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("-Track: " + track);
        }
    }

}
