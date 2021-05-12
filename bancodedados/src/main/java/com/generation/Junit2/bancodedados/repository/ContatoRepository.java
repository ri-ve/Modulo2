package com.generation.Junit2.bancodedados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.Junit2.bancodedados.Model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
