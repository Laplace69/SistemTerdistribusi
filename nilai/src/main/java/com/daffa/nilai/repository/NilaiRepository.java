/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.daffa.nilai.repository;

import com.daffa.nilai.entity.Nilai;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author USER
 */
public interface NilaiRepository extends JpaRepository<Nilai, Long>{
    
}
