package com.ycl.property.movie.controller;

import com.ycl.property.movie.dto.Movie;
import com.ycl.property.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yin.cl
 * @since 2019/10/20 18:34
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @GetMapping("/list")
    public List<Movie> selectAllMovie() {
        return movieService.selectAllMovie();
    }
}
