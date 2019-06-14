package com.mongodb.mongoCRUD.Service;

import com.mongodb.mongoCRUD.Model.SakilaFilms;
import com.mongodb.mongoCRUD.Repository.SalikaFilmsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SakilaFilmsService {


    private final SalikaFilmsRepository salikaFilmsRepository;

    public SakilaFilmsService(SalikaFilmsRepository salikaFilmsRepository) {
        this.salikaFilmsRepository = salikaFilmsRepository;
    }

    public List<SakilaFilms> getAllFilms() {
        return this.salikaFilmsRepository.findAll();
    }

    public SakilaFilms getFilmById(Integer filmId) {
        return this.salikaFilmsRepository.findById(filmId).get();
    }

    public String addFilm(SakilaFilms sakilaFilms) {
        this.salikaFilmsRepository.save(sakilaFilms);
        return "successfully added";
    }

    public String deleteFilmById(Integer filmId){
         this.salikaFilmsRepository.deleteById(filmId);
        return "SuccessFully deleted";
    }
}
