package com.mongodb.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class Item {
    @Id
    private String id;
    private String name;
    private String description;
}