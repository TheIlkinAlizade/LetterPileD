package com.letterpile.letterpiled.repositories;

import com.letterpile.letterpiled.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
