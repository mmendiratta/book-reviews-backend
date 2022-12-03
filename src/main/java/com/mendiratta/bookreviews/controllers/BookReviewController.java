package com.mendiratta.bookreviews.controllers;

import com.mendiratta.bookreviews.entities.BookReview;
import com.mendiratta.bookreviews.services.BookReviewService;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/book-reviews")
public class BookReviewController {

    private final BookReviewService bookReviewService;

    public BookReviewController(BookReviewService bookReviewService) {
        this.bookReviewService = bookReviewService;
    }

    @GetMapping("/reviews")
    public Iterable<BookReview> getReviews() {
        return this.bookReviewService.getAllReviews();
    }

    @GetMapping("/review/{title}")
    public BookReview getReviewByBookTitle(@RequestParam(value = "title") String title) {
        return this.bookReviewService.getBookByTitle(title);
    }

    @PostMapping("/review")
    public BookReview getReviewByBookTitle(
            @RequestParam(value = "author") String author,
            @RequestParam(value = "title") String title,
            @RequestParam(value = "review") String reviewContent,
            @RequestParam(value = "rating") int rating,
            @RequestParam(value = "date") String date
    ) {
//        Book book = new Book(title, author);
//        Review review = new Review(reviewContent, rating, date);
        BookReview bookReview = new BookReview(title, author, reviewContent, rating, date);
        return this.bookReviewService.createNewReview(bookReview);
    }
}
