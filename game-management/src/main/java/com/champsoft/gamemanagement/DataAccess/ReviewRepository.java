package com.champsoft.gamemanagement.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, ReviewId> {

    Review findReviewByReviewId(ReviewId ReviewId);
}
