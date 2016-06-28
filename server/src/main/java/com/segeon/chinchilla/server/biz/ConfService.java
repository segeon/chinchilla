package com.segeon.chinchilla.server.biz;

import com.segeon.chinchilla.server.dal.model.Conf;

import java.util.List;

/**
 * Created by segeon on 16-6-28.
 */
public interface ConfService {

    void addConf(int applicationId, String name, String value, long attributes);

    void addConf(String applicationCode, String name, String value, long attributes);

    void deleteConf(int confId);

    void deleteConf(int applicationId, String name);

    List<Conf> findConfByApplicationAndProfile(int applicationId, int profileId);

    List<Conf> findConfByApplicationAndProfile(String applicationCode, String profileCode);

    void updateConf(int applicationId, int profileId, String name, String value);

    void updateConf(int applicationId, int profileId, String name, long attributes);

    void updateConf(int applicationId, int profileId, String name, String value, long attributes);

    void updateConf(String applicationCode, String profileCode, String name, String value);

    void updateConf(String applicationCode, String profileCode, String name, long attributes);

    void updateConf(String applicationCode, String profileCode, String name, String value, long attributes);
}
