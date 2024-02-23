package com.example.bioskop.Service;

import com.example.bioskop.Entity.Bioskop;

import java.util.List;

public interface BioskopService {
    List<Bioskop> getAllBioskops();
    Bioskop getBioskopById(Long id);
    Bioskop addBioskop(Bioskop bioskop);
    Bioskop updateBioskop(Long id, Bioskop bioskop);
    void deleteBioskop(Long id);
}
