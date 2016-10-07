package com.segeon.chinchilla.server.biz.impl;

import com.segeon.chinchilla.server.biz.ApplicationService;
import com.segeon.chinchilla.server.dal.mapper.ApplicationMapper;
import com.segeon.chinchilla.server.dal.model.Application;
import com.segeon.chinchilla.server.dal.model.ApplicationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by segeon on 16-10-7.
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    public void addApplication(String name, String code, String des) {
        Application application = new Application();
        application.setName(name);
        application.setCode(code);
        application.setDescription(des);
        applicationMapper.insert(application);
    }

    @Override
    public List<Application> findAll() {
        return applicationMapper.selectByExample(null);
    }

    @Override
    public Application findByCode(String code) {
        ApplicationExample applicationExample = new ApplicationExample();
        applicationExample.createCriteria().andCodeEqualTo(code);
        List<Application> applications = applicationMapper.selectByExample(applicationExample);
        if (applications == null || applications.size() == 0)
            return null;
        if (applications.size() > 1) {
            throw new IllegalStateException("find " + applications.size() + " Applications for " + code);
        }
        return applications.get(0);
    }

    @Override
    public Application findByName(String name) {
        ApplicationExample applicationExample = new ApplicationExample();
        applicationExample.createCriteria().andNameEqualTo(name);
        List<Application> applications = applicationMapper.selectByExample(applicationExample);
        if (applications == null || applications.size() == 0)
            return null;
        if (applications.size() > 1) {
            throw new IllegalStateException("find " + applications.size() + " Applications for " + name);
        }
        return applications.get(0);
    }

    @Override
    public void delete(int id) {
        applicationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByCode(String code) {
        ApplicationExample applicationExample = new ApplicationExample();
        applicationExample.createCriteria().andCodeEqualTo(code);
        applicationMapper.deleteByExample(applicationExample);
    }

    @Override
    public void deleteByName(String name) {
        ApplicationExample applicationExample = new ApplicationExample();
        applicationExample.createCriteria().andNameEqualTo(name);
        applicationMapper.deleteByExample(applicationExample);
    }
}
