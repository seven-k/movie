package com.ycl.property.movie.service.impl;

import com.ycl.property.movie.dao.MovieDao;
import com.ycl.property.movie.dto.Movie;
import com.ycl.property.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yin.cl
 * @since 2019/10/20 18:34
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public List<Movie> selectAllMovie() {
        return movieDao.selectAllMovie();
    }
}
