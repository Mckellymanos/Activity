
package com.mycompany.musiclibrary;

import java.util.ArrayList;
import java.util.Random;

class Song {
    private String title;
    private String artist;
    private String album;

 
    public Song(String title, String artist, String album) {
        this.title = title;
        this.artist = artist;
        this.album = album;
    }


    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    
    public String displaySong() {
        return "Title: " + title + ", Artist: " + artist + ", Album: " + album;
    }
}

class MusicLibrary {
    private ArrayList<Song> songs;

   
    public MusicLibrary() {
        songs = new ArrayList<>();
    }

  
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added: " + song.displaySong());
    }

  
    public void removeSong(Song song) {
        if (songs.remove(song)) {
            System.out.println("Song removed: " + song.displaySong());
        } else {
            System.out.println("Song not found in the library.");
        }
    }

    
    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("The music library is empty.");
        } else {
            Random rand = new Random();
            int randomIndex = rand.nextInt(songs.size());
            Song randomSong = songs.get(randomIndex);
            System.out.println("Now playing: " + randomSong.displaySong());
        }
    }


    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

       
        Song song1 = new Song("Lame", "Midnasty", "Lame");
        Song song2 = new Song("One Spark", "Twice", "With You-th");
        Song song3 = new Song("IU", "Celebrity", "IU");

 
        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song3);

       
        library.playRandomSong();

        
        library.removeSong(song2);

        
        Song song4 = new Song("Hey Jude", "The Beatles", "Hey Jude");
        library.removeSong(song4);

        
        library.playRandomSong();
    }
}
