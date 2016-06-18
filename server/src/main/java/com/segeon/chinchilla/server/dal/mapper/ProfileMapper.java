package com.segeon.chinchilla.server.dal.mapper;

import com.segeon.chinchilla.server.dal.model.Profile;
import com.segeon.chinchilla.server.dal.model.ProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int countByExample(ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int deleteByExample(ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int insert(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int insertSelective(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    List<Profile> selectByExample(ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    Profile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int updateByExampleSelective(@Param("record") Profile record, @Param("example") ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int updateByExample(@Param("record") Profile record, @Param("example") ProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int updateByPrimaryKeySelective(Profile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table profile
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int updateByPrimaryKey(Profile record);
}