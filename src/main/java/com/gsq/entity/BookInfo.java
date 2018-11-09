package com.gsq.entity;

public class BookInfo {
    private Long bookId;
    private String name;
    private Integer number;
    private String detail;

    public Long getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDetail() {
        return detail;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
