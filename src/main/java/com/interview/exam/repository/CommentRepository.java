package com.interview.exam.repository;

import java.time.LocalDate;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interview.exam.entity.Comment;

@Repository
public interface CommentRepository extends  JpaRepository<Comment, Long> {
    List<Comment> findByBy(String by);
    List<Comment> findByDateOfComment(LocalDate dateOfComment);
}
