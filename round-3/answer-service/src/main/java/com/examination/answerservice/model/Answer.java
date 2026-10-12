package com.examination.answerservice.model;
import jakarta.persistence.*;
@Entity public class Answer { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String name; private String description; public Answer(){} public Answer(String name,String description){this.name=name;this.description=description;} public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} }
