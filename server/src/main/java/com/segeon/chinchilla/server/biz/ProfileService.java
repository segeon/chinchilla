package com.segeon.chinchilla.server.biz;

import com.segeon.chinchilla.server.dal.model.Profile;

import java.util.List;

/**
 * Created by segeon on 16-6-28.
 */
public interface ProfileService {

    void addProfile(String code, String name, String description);

    List<Profile> findAll();

    Profile findOne(int id);

    Profile findOne(String code);

    void deleteProfile(Profile profile);

    void deleteProfile(int profileId);

    void deleteProfile(String code);

    void renameProfile(String code, String newName);

    boolean updateProfileDescription(String code, String des);
}
