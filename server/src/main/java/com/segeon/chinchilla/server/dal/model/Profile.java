package com.segeon.chinchilla.server.dal.model;

import java.util.Date;

public class Profile {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.id
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.code
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.name
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.description
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.add_time
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.update_time
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.id
     *
     * @return the value of profile.id
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.id
     *
     * @param id the value for profile.id
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.code
     *
     * @return the value of profile.code
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.code
     *
     * @param code the value for profile.code
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.name
     *
     * @return the value of profile.name
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.name
     *
     * @param name the value for profile.name
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.description
     *
     * @return the value of profile.description
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.description
     *
     * @param description the value for profile.description
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.add_time
     *
     * @return the value of profile.add_time
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.add_time
     *
     * @param addTime the value for profile.add_time
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.update_time
     *
     * @return the value of profile.update_time
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.update_time
     *
     * @param updateTime the value for profile.update_time
     *
     * @mbggenerated Sat Jun 18 22:02:40 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}