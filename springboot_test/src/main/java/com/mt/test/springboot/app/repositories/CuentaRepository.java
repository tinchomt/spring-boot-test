package com.mt.test.springboot.app.repositories;

import com.mt.test.springboot.app.models.Cuenta;

import java.util.List;

public interface CuentaRepository {

    List<Cuenta> findAll();

    Cuenta findById(Long id);

    void update(Cuenta cuenta);

}
