package com.example.bioskop.Service;

import com.example.bioskop.Entity.Bioskop;
import com.example.bioskop.repository.BioskopRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BioskopServiceImpl implements BioskopService {
    @Autowired
    private BioskopRepository bioskopRepository;

    @Override
    public List<Bioskop> getAllBioskops() {
        return bioskopRepository.findAll();
    }

    @Override
    public Bioskop getBioskopById(Long id) {
        return bioskopRepository.findById(id).orElse(null);
    }

    @Override
    public Bioskop addBioskop(Bioskop bioskop) {
        return bioskopRepository.save(bioskop);
    }

    @Override
    public Bioskop updateBioskop(Long id, Bioskop bioskop) {
        return bioskopRepository.save(bioskop);
    }

    @Override
    public void deleteBioskop(Long id) {
        bioskopRepository.deleteById(id);
    }
}
