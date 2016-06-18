package com.segeon.chinchilla.server.dal.mapper;

import com.segeon.chinchilla.server.dal.model.ConfVersion;
import com.segeon.chinchilla.server.dal.model.ConfVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int countByExample(ConfVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int deleteByExample(ConfVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int insert(ConfVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int insertSelective(ConfVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    List<ConfVersion> selectByExample(ConfVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    ConfVersion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int updateByExampleSelective(@Param("record") ConfVersion record, @Param("example") ConfVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int updateByExample(@Param("record") ConfVersion record, @Param("example") ConfVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int updateByPrimaryKeySelective(ConfVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table conf_version
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    int updateByPrimaryKey(ConfVersion record);
}