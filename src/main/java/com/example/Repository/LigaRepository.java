package com.example.Repository;

import com.example.Model.Equipo;
import com.example.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by jhipster on 23/10/15.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {

    public List<Liga> findByNombre(String nombre);
}
