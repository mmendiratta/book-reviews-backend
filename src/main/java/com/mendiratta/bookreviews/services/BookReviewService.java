package com.mendiratta.bookreviews.services;

import com.mendiratta.bookreviews.entities.BookReview;
import com.mendiratta.bookreviews.repository.BookReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookReviewService {
    @Autowired
    private BookReviewRepository bookReviewRespository;

    public BookReview getBookByTitle(String title){
        return bookReviewRespository.findByTitle(title);
    }

    public List<BookReview> getAllReviews() {
        return bookReviewRespository.findAll();
    }

    public BookReview createNewReview(BookReview bookReview) {
        return bookReviewRespository.save(bookReview);
    }

}
