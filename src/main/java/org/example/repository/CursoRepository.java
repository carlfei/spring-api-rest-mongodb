package org.example.repository;

import org.example.model.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CursoRepository extends MongoRepository<Curso, Long> {


    public List<Curso> findByTema(String tema);

    public Page<Curso> findByOk(boolean ok, Pageable pageable);

    public List<Curso> findByCurso(String curso, Pageable sort);


}
