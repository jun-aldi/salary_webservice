package com.k3519046.juniar_uts.controller;

import com.k3519046.juniar_uts.dto.inputDto;
import com.k3519046.juniar_uts.dto.outputDto;
import com.k3519046.juniar_uts.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payrollinfo")
public class KaryawanController {

    @Autowired
    public KaryawanService karyawanService;

    @PostMapping("ceo")
    public ResponseEntity ceoBayaran(@RequestBody inputDto input){
        outputDto output = karyawanService.gajiCEO(input);
        return ResponseEntity.ok(output);
    }

    @PostMapping("manager")
    public ResponseEntity managerBayaran(@RequestBody inputDto input){
        outputDto output = karyawanService.gajiManager(input);
        return ResponseEntity.ok(output);
    }

    @GetMapping("senioremp/{family}/{overtime}")
    public ResponseEntity seniorEmpBayaran(@PathVariable int family, @PathVariable int overtime){
        outputDto output = karyawanService.gajiSeniorEmp(family, overtime);
        return  ResponseEntity.ok(output);
    }


    @GetMapping("junioremp/{family}/{overtime}")
    public ResponseEntity juniorEmpBayaran(@PathVariable int family, @PathVariable int overtime){
        outputDto output = karyawanService.gajiEmp(family, overtime);
        return  ResponseEntity.ok(output);
    }
}
