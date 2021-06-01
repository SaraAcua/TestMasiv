/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Masiv.Roulette.Controller;

import com.Masiv.Roulette.Entitys.Roulette;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.function.EntityResponse;

/**
 *
 * @author SARA
 */
@Controller
@RequestMapping("/roulette")
public class RouletteController {

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity createRoulette(@RequestBody Roulette roulette) {
        //Aqui guardamos con el meetodo y que registre con jdbc
        try {
            Map<String, Object> response = new HashMap<>();
            response.put("id", roulette.getId());
            return new ResponseEntity(response, HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/open")
    @ResponseBody
    public ResponseEntity openRoulette(@RequestParam("idRoulette") String idRoulette) {
        try {
            Map<String, Object> response = new HashMap<>();
         
            Roulette roulette = new Roulette("1", "open");
            if (roulette.getStatus().equals("open")) {
                response.put("status", "success");
                return new ResponseEntity(response, HttpStatus.OK);
            } else {
                response.put("status", "denied");
                return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception ex) {
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
