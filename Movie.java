
package com.mycompany.movie;


import java.util.ArrayList;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;

    
    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    
    public void addReview(String review) {
        reviews.add(review);
        System.out.println("Review added: " + review);
    }

    
    public ArrayList<String> getReviews() {
        return reviews;
    }

    
    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("Reviews: " + reviews);
    }

    
    public static void main(String[] args) {
        ArrayList<String> actors = new ArrayList<>();
        actors.add("Lee Do-Hyun");
        actors.add("Kim Go-eun");

        Movie movie = new Movie("Exhuma", "Jang Jae-hyun", actors);

        movie.addReview("Great movie!");
        movie.addReview("Could have been better.");

        ArrayList<String> movieReviews = movie.getReviews();
        System.out.println("All reviews: " + movieReviews);

        movie.displayMovieDetails();
    }
}
