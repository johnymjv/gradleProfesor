/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdsm.ejemplogradle.dao;

import com.bancodebogota.fdsm.ejemplogradle.entities.CiudadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jpramirez
 */
@Transactional
public interface CiudadRepository  extends JpaRepository<CiudadEntity, String> {

} 

