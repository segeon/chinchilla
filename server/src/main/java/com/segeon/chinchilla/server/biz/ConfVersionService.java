package com.segeon.chinchilla.server.biz;

import com.segeon.chinchilla.server.dal.model.ConfVersion;

/**
 * Created by segeon on 16-6-28.
 */
public interface ConfVersionService {

    void addConfVersion(int applicationId, int profileId);

    void incrementConfVersion(int applicationId, int profileId);

    void setCurrentVersion(int applicationId, int profileId, int currentVersion);

    int getCurrentVersion(int applicationId, int profileId);

    int getTopVersion(int applicationId, int profileId);

    ConfVersion findByApplicationIdAndProfileId(int applicationId, int profileId);

    ConfVersion findByApplicationCodeAndProfileCode(String applicationCode, String profileCode);
}
