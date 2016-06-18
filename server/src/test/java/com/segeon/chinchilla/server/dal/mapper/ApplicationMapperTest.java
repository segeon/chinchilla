package com.segeon.chinchilla.server.dal.mapper;

import com.segeon.chinchilla.server.dal.model.Application;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by segeon on 16-6-18.
 */
public class ApplicationMapperTest extends TestBase {

    @Autowired
    private ApplicationMapper applicationMapper;


    @org.junit.Test
    public void applicationMapperTest() throws Exception {
        Application application = applicationMapper.selectByPrimaryKey(1);
        if (application == null) {
            application = new Application();
            application.setId(1);
            application.setCode("test");
            application.setName("test");
            application.setDescription("just for test");
            applicationMapper.insert(application);
        } else {
            System.out.println("applicationId=" + application.getId());
        }
    }


}