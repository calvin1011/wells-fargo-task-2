package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;
    private long clientId;

    @Column(nullable = false)
    private Integer creationDate;

    public Portfolio(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }
}
