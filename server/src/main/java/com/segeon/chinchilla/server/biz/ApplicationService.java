package com.segeon.chinchilla.server.biz;

import com.segeon.chinchilla.server.dal.model.Application;

import java.util.List;

/**
 * Created by segeon on 16-6-28.
 */
public interface ApplicationService {

    void addApplication(String name, String code, String des);

    List<Application> findAll();

    Application findByCode(String code);

    Application findByName(String name);

    void delete(int id);

    void deleteByCode(String code);

    void deleteByName(String name);
}
