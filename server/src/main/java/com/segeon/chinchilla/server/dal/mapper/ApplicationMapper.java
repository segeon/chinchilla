package com.segeon.chinchilla.server.dal.mapper;

import com.segeon.chinchilla.server.dal.model.Application;
import com.segeon.chinchilla.server.dal.model.ApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int countByExample(ApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int deleteByExample(ApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int insert(Application record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int insertSelective(Application record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    List<Application> selectByExample(ApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    Application selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int updateByExampleSelective(@Param("record") Application record, @Param("example") ApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int updateByExample(@Param("record") Application record, @Param("example") ApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int updateByPrimaryKeySelective(Application record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table application
     *
     * @mbggenerated Tue Oct 04 20:02:46 CST 2016
     */
    int updateByPrimaryKey(Application record);
}