package com.example.tp_foyer.repositry;
import com.example.tp_foyer.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface UniversiteRepository extends JpaRepository<Universite, Long>{
}
