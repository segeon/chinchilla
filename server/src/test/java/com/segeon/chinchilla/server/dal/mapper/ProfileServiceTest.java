package com.segeon.chinchilla.server.dal.mapper;

import com.segeon.chinchilla.server.biz.ProfileService;
import com.segeon.chinchilla.server.dal.model.Profile;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by segeon on 16-10-7.
 */
public class ProfileServiceTest extends TestBase {
    private static final String DEV_PROF_KEY = "dev";

    @Autowired
    private ProfileService profileService;

    @Test
    public void addTest() {
        Profile one = profileService.findOne(DEV_PROF_KEY);
        if (one == null)
            profileService.addProfile(DEV_PROF_KEY, "开发环境", "用于开发过程");
    }

    @Test
    public void findTest() {
        List<Profile> all = profileService.findAll();
        assertThat(all).hasAtLeastOneElementOfType(Profile.class);
        System.out.println(all);
        Profile devProf = profileService.findOne(DEV_PROF_KEY);
        assertThat(devProf).isNotNull();
        Profile one = profileService.findOne(devProf.getId());
        assertThat(one).isNotNull();
        assertThat(one).isEqualToComparingFieldByField(devProf);
    }

    @Test
    public void modifyTest() {
        Profile dev = profileService.findOne(DEV_PROF_KEY);
        String newName = "本地开发环境";
        profileService.renameProfile(dev.getCode(), newName);
        String newDes = "local dev environment";
        profileService.updateProfileDescription(dev.getCode(), newDes);
        Profile newDev = profileService.findOne(DEV_PROF_KEY);
        assertThat(newDev.getName()).isEqualTo(newName);
        assertThat(newDev.getDescription()).isEqualTo(newDes);
    }

    @Test
    public void deleteTest() {
        Profile one = profileService.findOne(DEV_PROF_KEY);
        assertThat(one).isNotNull();
        profileService.deleteProfile(one);
        one = profileService.findOne(DEV_PROF_KEY);
        assertThat(one).isNull();

        profileService.addProfile(DEV_PROF_KEY, "xxx", "yyy");
        one = profileService.findOne(DEV_PROF_KEY);
        assertThat(one).isNotNull();
        profileService.deleteProfile(one.getCode());
        one = profileService.findOne(DEV_PROF_KEY);
        assertThat(one).isNull();

        profileService.addProfile(DEV_PROF_KEY, "xxx", "yyy");
        one = profileService.findOne(DEV_PROF_KEY);
        assertThat(one).isNotNull();
        profileService.deleteProfile(one.getId());
        one = profileService.findOne(DEV_PROF_KEY);
        assertThat(one).isNull();
    }
}
