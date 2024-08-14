package com.interview.exam.entity;

import java.time.LocalDate;

import jakarta.persistence.*;



@Entity
@Table(name = "Comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Byyyy")
    private String by;

    @Column(name = "Textttt")
    private String text;

    @Column(name = "dateofcommentttt")
    private LocalDate dateOfComment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(LocalDate dateOfComment) {
        this.dateOfComment = dateOfComment;
    }
}