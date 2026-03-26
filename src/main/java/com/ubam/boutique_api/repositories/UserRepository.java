package com.ubam.boutique_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubam.boutique_api.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario , Integer> {

    
} 
