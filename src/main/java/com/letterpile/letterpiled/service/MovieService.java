package com.letterpile.letterpiled.service;

import com.letterpile.letterpiled.dto.MovieDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MovieService {

    MovieDto addMovie(MovieDto movieDto, MultipartFile file) throws IOException;

    MovieDto getMovie(Integer movieId) throws IOException;

    List<MovieDto> getAllMovies() throws IOException;
}
