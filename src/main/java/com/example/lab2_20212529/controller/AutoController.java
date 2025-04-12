package com.example.lab2_20212529.controller;

import com.example.lab2_20212529.repository.AutoRepository;
import com.example.lab2_20212529.repository.SedeRepository;
import com.example.lab2_20212529.repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutoController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @Autowired
    private AutoRepository autoRepository;


    @GetMapping("/verLista")
    public String listAuto(Model model) {
        model.addAttribute("autoList", autoRepository.findAll());
        return "Listar/listaAutos";
    }

    @Autowired
    private SedeRepository sedeRepository;

    @GetMapping("/verListaSede")
    public String listSede(Model model) {
        model.addAttribute("sedeList", sedeRepository.findAll());
        return "Listar/listaSede";
    }

    @Autowired
    private SeguroRepository seguroRepository;

    @GetMapping("/verListaSeguro")
    public String listSeguro(Model model) {
        model.addAttribute("seguroList", seguroRepository.findAll());
        return "Listar/listaSeguro";
    }



}