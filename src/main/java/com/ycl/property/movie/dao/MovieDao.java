package com.ycl.property.movie.dao;

import com.ycl.property.movie.dto.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yin.cl
 * @since 2019/10/20 18:33
 */
@Mapper
public interface MovieDao {

    List<Movie> selectAllMovie();
}
