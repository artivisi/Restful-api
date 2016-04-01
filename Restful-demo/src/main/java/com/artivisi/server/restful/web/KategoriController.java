package com.artivisi.server.restful.web;

import com.artivisi.server.restful.domain.Kategori;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class KategoriController {
    
    List<Kategori> list = new ArrayList<Kategori>();

    public KategoriController() {
        Kategori kat1 = new Kategori();
        kat1.setKelas(String.valueOf(new Random().nextInt()));
        kat1.setDeskripsi("Kategori 1");
        
        Kategori kat2 = new Kategori();
        kat2.setKelas(String.valueOf(new Random().nextInt()));
        kat2.setDeskripsi("Kategori 2");
        
        Kategori kat3 = new Kategori();
        kat3.setKelas(String.valueOf(new Random().nextInt()));
        kat3.setDeskripsi("Kategori 3");
        
        list.add(kat1);
        list.add(kat2);
        list.add(kat3);
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Kategori> getAllList() {
        return list;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void saveKategori(@RequestBody Kategori kat) {
        list.add(kat);
    }
    
}
