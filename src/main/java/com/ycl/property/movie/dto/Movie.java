package com.ycl.property.movie.dto;

import lombok.Data;

/**
 * @author yin.cl
 * @since 2019/10/20 18:53
 */
@Data
public class Movie {

    private String id;
    private String title;
    private String directors;
    private String rate;
    private String casts;
    private String cover;

}
