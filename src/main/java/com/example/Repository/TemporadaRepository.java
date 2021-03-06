package com.example.Repository;

import com.example.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 23/10/15.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {
    public List<Temporada> findByAnyo(Date anyo);

}
