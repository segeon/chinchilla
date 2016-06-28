package com.segeon.chinchilla.server.biz;

import com.segeon.chinchilla.server.dal.model.Module;

import java.util.List;

/**
 * Created by segeon on 16-6-28.
 */
public interface ModuleService {

    void addModule(int id, String name, String code, String description);

    void addModule(String applicationCode, String name, String code, String description);

    void deleteModuleByName(int applicationId, String name);

    void deleteModuleByName(String applicationCode, String name);

    void deleteModuleByCode(int applicationId, String code);

    void deleteModuleByCode(String applicationCode, String code);

    void updateModule(int applicationId, int moduleId, String name, String description);

    List<Module> findApplicationModules(int applicationId);

    List<Module> findApplicationModules(String applicationName);
}
