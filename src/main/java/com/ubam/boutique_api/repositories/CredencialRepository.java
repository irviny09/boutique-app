package com.ubam.boutique_api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubam.boutique_api.entities.Credencial;

public interface CredencialRepository extends JpaRepository<Credencial , Integer>{
    Optional<Credencial> findByEmail(String email);
}
