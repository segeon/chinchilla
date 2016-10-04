package com.segeon.chinchilla.server.dal.custmapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by segeon on 16-10-4.
 */
public interface CustProfileMapper {

    void updateProfileNameByCode(@Param("code") String code, @Param("name") String name);

    void updateProfileDescByCode(@Param("code") String code, @Param("desc") String desc);
}
