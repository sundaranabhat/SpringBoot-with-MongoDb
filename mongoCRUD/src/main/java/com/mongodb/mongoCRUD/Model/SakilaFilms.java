package com.mongodb.mongoCRUD.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection="Sakila_films")
public class SakilaFilms {
    @Id
    public Integer Id;
    public String Category;
    public String Description;
    public String Length;
    public String Rating;
    public String RentalDuration;
    public String  SpecialFeatures;
    public String Title;
    public List<String>ActotNames;

}
