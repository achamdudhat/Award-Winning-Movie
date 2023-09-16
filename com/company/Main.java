/*
Author: AchamD
File: Main.java
Purpose: Java application that implements a driver to demonstrate the
 functionality of a base class (Movie) and its derived class
 (AwardWinningMovie)
Compiler/IDE:  Java 17.0.1/Apache NetBeans 12.6
Operating
system: MS Windows 10 Home
Reference(s):  Java 17 API - Oracle Documentation (Class lecture,ppts,etc.)
 ( https://docs.oracle.com/en/java/javase/17/docs/api/);
  */

package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main extends AwardWinningMovie {

    public static void main(String[] args) {
        // write your code here

        AwardWinningMovie Array[] = new AwardWinningMovie[10];
        for(int i=0;i<10;i++) {Array[i]=new AwardWinningMovie();}
        Array[0].setTitle("Raiders of the Lost Ark");
        Array[0].setRating("PG");
        Array[0].setGenre("Action");
        Array[0].setDirector("Steven Spielberg");
        Array[0].setStar("Harrison Ford");
        Array[0].setAwardTitle("Saturn Award for Best Award");
        Array[0].setAwardYear(1982);

        Array[1].setTitle("Contact");
        Array[1].setRating("PG");
        Array[1].setGenre("Drama");
        Array[1].setDirector("Robert Zemeckis");
        Array[1].setStar("Jodie Foster");
        Array[1].setAwardTitle("Saturn Award for Best Actress");
        Array[1].setAwardYear(1998);

        Array[2].setTitle("Forrest Gump");
        Array[2].setRating("PG-13");
        Array[2].setGenre("Drama");
        Array[2].setDirector("Robert Zemeckis");
        Array[2].setStar("Tom Hanks");
        Array[2].setAwardTitle("Oscar for the Best Actor in a Leading Role");
        Array[2].setAwardYear(1995);

        Array[3].setTitle("Elf");
        Array[3].setRating("PG");
        Array[3].setGenre("Comedy");
        Array[3].setDirector("Jon Favreau");
        Array[3].setStar("Will Ferrell");
        Array[3].setAwardTitle("ASCAP Award for Top Box Office Films");
        Array[3].setAwardYear(2004);

        Array[4].setTitle("Logan");
        Array[4].setRating("R");
        Array[4].setGenre("Action");
        Array[4].setDirector("James Mangold");
        Array[4].setStar("Patrick Stewart");
        Array[4].setAwardTitle("Saturn Sward for Best Supporting Actor");
        Array[4].setAwardYear(2015);

        Array[5].setTitle("La la Land");
        Array[5].setRating("PG-13");
        Array[5].setGenre("Comedy");
        Array[5].setDirector("Damien Chazelle");
        Array[5].setStar("Emma Stone");
        Array[5].setAwardTitle("Oscar for Best Performance by an Actress in a Leading Role");
        Array[5].setAwardYear(2017);

        Array[6].setTitle("3 Idiots");
        Array[6].setRating("PG-13");
        Array[6].setGenre("Comedy");
        Array[6].setDirector("Raju Hirani");
        Array[6].setStar("Aamir Khan");
        Array[6].setAwardTitle("Filmfare");
        Array[6].setAwardYear(2010);

        Array[7].setTitle("The Queen");
        Array[7].setRating("PG-13");
        Array[7].setGenre("Biography");
        Array[7].setDirector("Stephen Frears");
        Array[7].setStar("Helen Mirren");
        Array[7].setAwardTitle("Oscar for Best Performance by an Actress in a Leading Role");
        Array[7].setAwardYear(2007);

        Array[8].setTitle("The Imitation Game");
        Array[8].setRating("PG");
        Array[8].setGenre("Biography");
        Array[8].setDirector("Morten Tyler");
        Array[8].setStar("Benedict Cumberbatch");
        Array[8].setAwardTitle("Oscar for Best Writing, Adapted Screenplay");
        Array[8].setAwardYear(2015);

        Array[9].setTitle("Mission Impossible: Fallout");
        Array[9].setRating("PG");
        Array[9].setGenre("Action");
        Array[9].setDirector("Steve McQuarrie");
        Array[9].setStar("Tom Cruise");
        Array[9].setAwardTitle("Oscar for Best Actor");
        Array[9].setAwardYear(2018);




        System.out.println("run:\n" + "__________________________________________" +
                "\nEXPERIMENTAL AWARD-WINNING MOVIE DATABASE*\n" +
                "__________________________________________" +
                "\n(*Funded in part by IMDb.com)" +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\nPlease note that movie titles are displayed alphabetically by default." +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int finput=0;
        do {
            System.out.println("\n\nSelect an option from the menu below. \n" +
                    "1) Display a list of popular movies \n" +
                    "2) Search the database \n" +
                    "3) Quit \n" + "\n Your Choice? ");

            Scanner sc = new Scanner(System.in);
            boolean done = false;
            while (! done)
            {
                try
                {
                    finput = sc.nextInt();
                            done = true;
                }
                catch (InputMismatchException e)
                {
                    sc.nextLine();
                    System.out.println("Enter a number only"+"\nYour choice? ");
                }
            }

while (!(finput>0&&finput<4)){
    System.out.println("Please enter from 1-3 only\n"+"Your choice\n");
finput= sc.nextInt();}
            if (finput == 1) {
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                        "Selected award-winning movies: \n" +
                        " 1) Contact \n" +
                        " 2) Elf \n" +
                        " 3) La La Land \n" +
                        " 4) Raiders of the Lost Ark \n" +
                        " 5) The Queen \n" +
                        " 6) 3 Idiots\n" +
                        " 7) The Imitation Game \n" +
                        " 8) Logan \n" +
                        "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+
                        "\nPlease enter the number of movie you would like to know:\n");
                Scanner sc1 = new Scanner(System.in);
                int sinput=0;
                done = false;
                while (! done)
                {
                    try
                    {
                        sinput = sc1.nextInt();
                        done = true;
                    }
                    catch (InputMismatchException e)
                    {
                        sc1.nextLine();
                        System.out.println("Enter a number only"+"\nYour choice? ");
                    }
                }
                if (sinput == 1) {
                    System.out.println("Title:     Contact \n" +
                            "Rating:    PG \n" +
                            "Genre:     Drama \n" +
                            "Director:  Robert Zemeckis \n" +
                            "Star:      Jodie Foster \n" +
                            "Award:     Saturn Award for Best Actress, 1998 \n");
                }
                if (sinput == 2) {
                    System.out.println("Title:     Elf \n" +
                            "Rating:    PG \n" +
                            "Genre:     Comedy \n" +
                            "Director:  Jon Favreau \n" +
                            "Star:      Will Ferrell \n" +
                            "Award:     ASCAP Award for Top Box Office Films, 2004 \n");
                }
                if (sinput == 3) {
                    System.out.println("Title:     La La Land \n" +
                            "Rating:    PG-13 \n" +
                            "Genre:     Comedy \n" +
                            "Director:  Damien Chazelle \n" +
                            "Star:      Emma Stone \n" +
                            "Award:     Oscar for Best Performance by an Actress in a Leading Role, 2017 \n"
                    );
                }
                if (sinput == 4) {
                    System.out.println("Title:     Raiders of the Lost Ark \n" +
                            "Rating:    PG \n" +
                            "Genre:     Action \n" +
                            "Director:  Steven Spielberg \n" +
                            "Star:      Harrison Ford \n" +
                            "Award:     Saturn Award for Best Actor, 1982 \n");
                }
                if (sinput == 5) {
                    System.out.println("Title:   The Queen\n" +
                            "Rating:PG-13\n" +
                            "Genre:Biography\n" +
                            "Director: Stephen Frears\n" +
                            "Star:Helen Mirren\n" +
                            "Award: Oscar for Best Performance by an Actress in a Leading Role, 2007");
                }
                if (sinput==6){
                    System.out.println("Title:   3 Idiots\n" +
                            "Rating:PG-13\n" +
                            "Genre:Comedy\n" +
                            "Director: Raju Hirani\n" +
                            "Star:Aamir Khan\n" +
                            "Award: Filmfare, 2010");
                }
                if (sinput==7){
                    System.out.println("Title:   The Imitation Game\n" +
                            "Rating:PG\n" +
                            "Genre:Biography\n" +
                            "Director: Morten Tyler\n" +
                            "Star:Benedict Cumberbatch\n" +
                            "Award: Oscar for Best Writing, Adapted Screenplay, 2015");
                }
                if (sinput==8){
                    System.out.println("Title:   Logan\n" +
                            "Rating:R\n" +
                            "Genre:Action\n" +
                            "Director: James Mangold\n" +
                            "Star:Patrick Stewart\n" +
                            "Award: Saturn Sward for Best Supporting Actor, 2015");
                }

            }
                if (finput == 2) {
                    System.out.println("Type t to serach by title or type s to search by star");
                    String search, searchone;
                    Scanner scSearch = new Scanner(System.in);
                    search = scSearch.nextLine();
                    while (!(search.equals("T") || search.equals("S") || search.equals("s") || search.equals("t"))) {
                        System.out.println("\n** Invalid choice! Please enter T or S. **\n" +
                                "Type t to search by title or type s to search by star");
                        search = scSearch.next();
                    }
                    String wordsearch;
                    if (search.equals("t") || search.equals("T")) {
                        System.out.println("\nPlease enter the name of Title");
                    }
                    if (search.equals("S") || (search.equals("s"))) {
                        System.out.println("\nPlease enter the name of Star: ");
                    }
                    int flag = 0;
                    System.out.println("");
                    Scanner sc5 = new Scanner(System.in);
                    wordsearch = sc5.nextLine();
                    wordsearch = wordsearch.trim();
                    wordsearch = wordsearch.toUpperCase();
                    if (search.equals("t") || search.equals("T")) {
                        for (int i = 0; i < 10; i++) {
                            String compare = Array[i].getTitle();
                            compare = compare.toUpperCase();
                            if (compare.equals(wordsearch)) {
                                flag = 1;
                                Array[i].toString();
                            }
                        }
                    }
                    if (flag == 0) {
                        if (search.equals("t") || search.equals("T")) {
                            for (int i = 0; i < 10; i++) {
                                String compare = Array[i].getTitle();
                                compare = compare.toUpperCase();
                                StringTokenizer compare1 = new StringTokenizer(compare);
                                int counting = compare1.countTokens();
                                for (int a = 0; a < counting; a++) {
                                    if (compare1.nextToken().equals(wordsearch)) {
                                        flag = 1;
                                        Array[i].toString();
                                    }
                                }
                            }
                        }
                    }
                    if (flag == 0) {
                        if (search.equals("S") || (search.equals("s"))) {
                            for (int i = 0; i < 10; i++) {
                                String compare = Array[i].getStar();
                                compare = compare.toUpperCase();
                                if (compare.equals(wordsearch)) {
                                    flag = 1;
                                    Array[i].toString();
                                }
                            }
                        }
                        if (flag == 0) {
                            if (search.equals("S") || (search.equals("s"))) {
                                for (int i = 0; i < 10; i++) {
                                    String dekho = Array[i].getStar();
                                    dekho = dekho.toUpperCase();
                                    StringTokenizer compare1 = new StringTokenizer(dekho);
                                    int counting = compare1.countTokens();
                                    for (int a = 0; a < counting; a++) {
                                        if (compare1.nextToken().equals(wordsearch)) {
                                            flag = 1;
                                            Array[i].toString();
                                        }
                                    }
                                }
                            }
                        }

                        if (flag == 0) {
                            System.out.println("\nNot found in the database");
                        }

                    }

                }

            }while(finput!=3);

        System.out.println("The Program has ended");
    }
    }

