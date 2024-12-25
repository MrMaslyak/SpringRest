package com.maslyak.practicRest.controller;

import com.maslyak.practicRest.entity.Cat;
import com.maslyak.practicRest.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

    @Autowired
    private CatRepository catRepository;
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MainController.class);


    @PostMapping("/add")
    public void addCat(@RequestBody Cat cat) {
        log.info("Cat: {}", cat);
        catRepository.save(cat);
    }




    @GetMapping("/all")
    public String getAll(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Cat cat : catRepository.findAll()) {
            stringBuilder.append(cat).append("<br>");
        }
        return stringBuilder.toString();
    }

    @GetMapping("/api")
    public Cat getCat(@RequestParam int id) {
        return catRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/delete")
    public void deleteCat(@RequestParam int id) {
        catRepository.deleteById(id);
    }

    @PutMapping("/update")
    public String updateCat(@RequestBody Cat cat) {
//        if (!catRepository.existsById(cat.getId())){
//            return "No such row";
//        }
        return catRepository.save(cat).toString();
    }

}
