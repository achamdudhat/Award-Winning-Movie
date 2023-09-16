package com.company;
import java.util.*;
public class AwardWinningMovie extends Movie {
    private String awardTitle;
    private int awardYear;
    public AwardWinningMovie(){ super();
    awardTitle=null;
    awardYear=0;
    }
    public AwardWinningMovie(String title, String rating, String genre, String director, String star, String awardTitle, int awardYear) {
        super(title,rating,genre,director,star);
        this.awardTitle = awardTitle;
        this.awardYear = awardYear;
    }

    public String getAwardTitle() {
        return awardTitle;
    }

    public void setAwardTitle(String awardTitle) {
        this.awardTitle = awardTitle;
    }

    public int getAwardYear() {
        return awardYear;
    }

    public void setAwardYear(int awardYear) {
        this.awardYear = awardYear;
    }


    public String toString()
    {

        super.toString();
         System.out.println("\nAward: "+awardTitle+", "+awardYear );
    return null;}
}