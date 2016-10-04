package com.segeon.chinchilla.server.biz.impl;

import com.google.common.base.Preconditions;
import com.segeon.chinchilla.server.biz.ProfileService;
import com.segeon.chinchilla.server.dal.custmapper.CustProfileMapper;
import com.segeon.chinchilla.server.dal.mapper.ProfileMapper;
import com.segeon.chinchilla.server.dal.model.Profile;
import com.segeon.chinchilla.server.dal.model.ProfileExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by segeon on 16-10-4.
 */
@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileMapper profileMapper;
    @Autowired
    private CustProfileMapper custProfileMapper;

    @Override
    public void addProfile(String code, String name, String description) {
        Preconditions.checkNotNull(code);
        Preconditions.checkNotNull(name);
        Profile profile = new Profile();
        profile.setCode(code);
        profile.setName(name);
        profile.setDescription(description);
        profile.setAttrs(0L);
        profileMapper.insert(profile);
    }

    @Override
    public List<Profile> findAll() {
        ProfileExample profileExample = new ProfileExample();
        profileExample.createCriteria().andIdIsNotNull();
        return profileMapper.selectByExample(profileExample);
    }

    @Override
    public Profile findOne(int id) {
        return profileMapper.selectByPrimaryKey(id);
    }

    @Override
    public Profile findOne(String code) {
        ProfileExample profileExample = new ProfileExample();
        profileExample.createCriteria().andCodeEqualTo(code);
        List<Profile> profiles = profileMapper.selectByExample(profileExample);
        if (profiles == null || profiles.isEmpty()) {
            return null;
        }
        if (profiles.size() > 1) {
            throw new IllegalStateException("found " + profiles.size() + " with code " + code);
        }
        return profiles.get(0);
    }

    @Override
    public void deleteProfile(Profile profile) {
        Preconditions.checkNotNull(profile);
        Preconditions.checkArgument(profile.getId() != null || profile.getCode() != null);
        ProfileExample profileExample = new ProfileExample();
        ProfileExample.Criteria criteria = profileExample.createCriteria();
        if (profile.getId() != null) {
            criteria.andIdEqualTo(profile.getId());
        }
        if (profile.getCode() != null) {
            criteria.andCodeEqualTo(profile.getCode());
        }
        profileMapper.deleteByExample(profileExample);
    }

    @Override
    public void deleteProfile(int profileId) {
        profileMapper.deleteByPrimaryKey(profileId);
    }

    @Override
    public void deleteProfile(String code) {
        Preconditions.checkNotNull(code);
        ProfileExample profileExample = new ProfileExample();
        ProfileExample.Criteria criteria = profileExample.createCriteria();
        if (code != null) {
            criteria.andCodeEqualTo(code);
        }
        profileMapper.deleteByExample(profileExample);
    }

    @Override
    public void renameProfile(String code, String newName) {
        custProfileMapper.updateProfileNameByCode(code, newName);
    }

    @Override
    public void updateProfileDescription(String code, String des) {
        custProfileMapper.updateProfileDescByCode(code, des);
    }
}
