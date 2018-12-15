package com.dreamertn9527.dreamertn9527.domain.mongodb;

import lombok.Data;

import javax.persistence.Id;

@Data
public class MongoSequence {
    @Id
    private String id;
    private Long seq;
}