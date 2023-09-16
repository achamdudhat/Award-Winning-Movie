package com.company;

import java.util.Scanner;

class Movie{
    private String movieID, title, rating, genre, director,star;

    public Movie(){title=null;
    rating=null;
    genre=null;
    director=null;
    star=null;}
    public Movie(String title, String rating, String genre, String director, String star){
        this.title=title;
        this.rating=rating;
        this.genre=genre;
        this.director=director;
        this.star=star;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String toString()
    {

        System.out.print("Title:" + "   " + title);
        System.out.print("\nRating:" + "" + rating);
        System.out.print("\nGenre:" + "" + genre);
        System.out.print("\nDirector:" + " " + director);
        System.out.print("\nStar:" + "" + star);
        return null;
    }

public static void displayOptions(){
    int finput;
    Scanner sc = new Scanner(System.in);
    finput = sc.nextInt();
        if (finput==1){System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"+
        "Selected award-winning movies: \n" +
        " 1) Contact \n" +
        " 2) Elf \n" +
        " 3) La La Land \n" +
        " 4) Raiders of the Lost Ark \n" +
        " 5) Silver Linings Playbook \n" +
        " 6) Star Wars: Episode VII - The Force Awakens \n" +
        " 7) The Imitation Game \n" +
        " 8) X-Men \n"+
        "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int sinput;
            Scanner sc1=new Scanner(System.in);
            sinput=sc1.nextInt();
            if (sinput==1){System.out.println("Title:     Contact \n" +
                    "Rating:    PG \n" +
                    "Genre:     Drama \n" +
                    "Director:  Robert Zemeckis \n" +
                    "Star:      Jodie Foster \n" +
                    "Award:     Saturn Award for Best Actress, 1998 \n");
            }
            if(sinput==2){System.out.println("Title:     Elf \n" +
                    "Rating:    PG \n" +
                    "Genre:     Comedy \n" +
                    "Director:  Jon Favreau \n" +
                    "Star:      Will Ferrell \n" +
                    "Award:     ASCAP Award for Top Box Office Films, 2004 \n");}
            if (sinput==3){System.out.println("Title:     La La Land \n" +
                    "Rating:    PG-13 \n" +
                    "Genre:     Comedy \n" +
                    "Director:  Damien Chazelle \n" +
                    "Star:      Emma Stone \n" +
                    "Award:     Oscar for Best Performance by an Actress in a Leading Role, 2017 \n"
                    );}
            if (sinput==4){System.out.println("Title:     Raiders of the Lost Ark \n" +
                    "Rating:    PG \n" +
                    "Genre:     Action \n" +
                    "Director:  Steven Spielberg \n" +
                    "Star:      Harrison Ford \n" +
                    "Award:     Saturn Award for Best Actor, 1982 \n");

            if(sinput==5){}

            }
        if (finput==2){System.out.println("Type t to serach by title or type s to search by star");
        String search,searchone;
        Scanner scSearch=new Scanner(System.in);
        search= scSearch.next();
        while ((scSearch.equals("T")||scSearch.equals("S")||scSearch.equals("s")||scSearch.equals("t")))
            {
                System.out.println("\n** Invalid choice! Please enter T or S. **\n" +
                        "Type t to search by title or type s to search by star");
                search= scSearch.next();}


        }
}
}
}