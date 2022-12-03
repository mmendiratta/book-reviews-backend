package com.mendiratta.bookreviews.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bookreviews")
@Data
public class BookReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String title;
    private String author;
    private  String content;
    private  int rating;
    private  String date;

    public BookReview () {

    }

    public BookReview (String title, String author, String content, int rating, String date) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.rating = rating;
        this.date = date;
    }
}
