package com.examination.candidateservice.model;
import jakarta.persistence.*;
@Entity public class Candidate { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String name; private String description; public Candidate(){} public Candidate(String name,String description){this.name=name;this.description=description;} public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;} }
