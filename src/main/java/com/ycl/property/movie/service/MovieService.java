package com.ycl.property.movie.service;

import com.ycl.property.movie.dto.Movie;

import java.util.List;

/**
 * @author yin.cl
 * @since 2019/10/20 18:33
 */
public interface MovieService {

    List<Movie> selectAllMovie();
}
