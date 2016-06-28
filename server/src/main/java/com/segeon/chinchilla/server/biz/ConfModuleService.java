package com.segeon.chinchilla.server.biz;

/**
 * Created by segeon on 16-6-28.
 */
public interface ConfModuleService {

    void addConfModule(int confId, int moduleId);

    void addConfModule(String applicationCode, String confName, String moduleCode);

    void deleteConfModule(int id);

    void deleteConfModule(int confId, int moduleId);

    void deleteConfModule(String applicationCode, String confName, String moduleCode);
}
