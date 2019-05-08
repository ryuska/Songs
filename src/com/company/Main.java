package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Song s = new Song();

        for (int i = 0; i< 2;i++){

            System.out.println("Please enter an artist: ");
            String Artist = scan.nextLine();
            s.setArtist(scan.nextLine());
            System.out.println(("Please enter a title:"));
            String Title = scan.nextLine();
            s.setTitle(scan.nextLine());
            songs.add(s);

//            String artist = "Prince";//modify program to prompt user for an artist
//            String title = "Purple Rain"; //modify program to prompt user for a title
//
//            s.setArtist(artist);
//            s.setTitle(title);
//            (s);
        }

        //print all the songs in the array list
        for(Song y : songs){
            System.out.println(y.getTitle());
        }

        //look for blue and print if found

        System.out.println("Please enter your song: ");
        String titleToFind = scan.nextLine();
        for (Song y: songs){
            if (y.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",y.display());
            }
        }
    }
}
