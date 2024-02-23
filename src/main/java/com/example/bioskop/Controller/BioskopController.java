package com.example.bioskop.Controller;

import com.example.bioskop.Entity.Bioskop;
import com.example.bioskop.Service.BioskopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/bioskops")
public class BioskopController {
    @Autowired
    private BioskopService bioskopService;
    @PostMapping
    public Bioskop addBioskop(@RequestBody Bioskop bioskop) {
        return bioskopService.addBioskop(bioskop);
    }

    @GetMapping
    public List<Bioskop> getAllBioskops(){
        return  bioskopService.getAllBioskops();
    }

    @GetMapping("/{id}")
    public Bioskop getBioskopById(@PathVariable long id) {
        return  bioskopService.getBioskopById(id);
    }

    @PutMapping("/{id}")
    public Bioskop updateBioskop(@PathVariable Long id, @RequestBody Bioskop bioskop) {
        return bioskopService.updateBioskop(id, bioskop);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bioskopService.deleteBioskop(id);
    }
}
