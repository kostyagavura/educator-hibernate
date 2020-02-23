package com.bihuniak.educator.basic;

import javax.persistence.Embeddable;

@Embeddable
public class PostCode {

    private String postCode;

    public PostCode(String postCode) {
        this.postCode = postCode;
    }

    public PostCode() {

    }

    @Override
    public String toString() {
        return postCode;
    }
}