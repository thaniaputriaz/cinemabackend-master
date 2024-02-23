package com.example.bioskop.repository;

import com.example.bioskop.Entity.Bioskop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BioskopRepository extends JpaRepository<Bioskop, Long> {
}
