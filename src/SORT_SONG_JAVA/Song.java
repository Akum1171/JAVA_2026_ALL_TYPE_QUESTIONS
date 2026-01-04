package SORT_SONG_JAVA;

import java.util.ArrayList;


public class Song implements Comparable<MP4>
{
    private String titles;
    private String artist;
    private Integer year;

    public Song(String titles, String artist, Integer year) {
        super();
        this.titles = titles;
        this.artist = artist;
        this.year = year;
    }
    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getTitles() {
        return titles;
    }

    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Song [titles=" + titles + ", artist=" + artist + ", year=" + year + "]";
    }

    @Override
    public int compareTo(MP4 o) {
        // TODO Auto-generated method stub
        return 0;
    }
     static void main(String[] args)
    {

        Song song1=new Song("Ham tere sehar me aaye hai musafir ki trah ","Amit Kumar",2014);
        Song song2=new Song("tum dil ki dhadhkan", "Rahet fateh", 2021);
        Song song3=new Song("Aja sajan aaja ", "Late mangeswar", 2017);
        Song song4=new Song("Tujhse naraz nahi hai dil", "Ajay thakur ", 2010);
        Song song5=new Song("mere khyabo me jo aaye ", "Jubit natyal", 2023);

        ArrayList<Song> musicList=new ArrayList<>();
        musicList.add(song1);
        musicList.add(song2);
        musicList.add(song3);
        musicList.add(song4);
        musicList.add(song5);

        //	Collections.sort(musicList);
    }

}