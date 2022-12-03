package com.mendiratta.bookreviews.repository;

import com.mendiratta.bookreviews.entities.BookReview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookReviewRepository extends JpaRepository<BookReview, Long> {
    BookReview findByTitle(String title);
}
