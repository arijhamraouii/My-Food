package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Adresse;

public interface AdresseRepository extends JpaRepository<Adresse,Integer>{
	List<Adresse> findByVille(String ville);

}
