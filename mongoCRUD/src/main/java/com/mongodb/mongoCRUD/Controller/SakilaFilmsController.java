package com.mongodb.mongoCRUD.Controller;

import com.mongodb.mongoCRUD.Model.SakilaFilms;
import com.mongodb.mongoCRUD.Service.SakilaFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class SakilaFilmsController {

    @Autowired
    private final SakilaFilmsService sakilaFilmsService;

    public SakilaFilmsController(SakilaFilmsService sakilaFilmsService) {
        this.sakilaFilmsService = sakilaFilmsService;
    }

    @GetMapping("/get-all-films")
    public List<SakilaFilms> getAllFilms() {
        return this.sakilaFilmsService.getAllFilms();
    }

    @GetMapping("/get-film-by-id/{id}")
    public SakilaFilms getFilmById(@PathVariable Integer filmId) {
        return this.getFilmById(filmId);
    }

    @PostMapping("/add-film")
    public String addFilm(@RequestBody SakilaFilms sakilaFilms) {
        return this.sakilaFilmsService.addFilm(sakilaFilms);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public String deleteById(@PathVariable Integer filmId) {
        return this.sakilaFilmsService.deleteFilmById(filmId);
    }

}



