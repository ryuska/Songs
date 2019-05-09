package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i< 2;i++) {

            Song s = new Song();
            System.out.println("Please enter an artist: ");
            s.setArtist(scan.nextLine());
            System.out.println(("Please enter a title:"));
            s.setTitle(scan.nextLine());
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song y : songs) {
            System.out.println(y.display());
        }

        System.out.println("Please enter your title: ");
        String titleToFind = scan.nextLine();
        for (Song y: songs){
            if (y.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",y.display());
            }
        }
    }
}
