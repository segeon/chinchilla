package com.segeon.chinchilla.server.dal.model;

import java.util.Date;

public class Application {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.name
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.code
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.description
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.add_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column application.update_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.id
     *
     * @return the value of application.id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.id
     *
     * @param id the value for application.id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.name
     *
     * @return the value of application.name
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.name
     *
     * @param name the value for application.name
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.code
     *
     * @return the value of application.code
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.code
     *
     * @param code the value for application.code
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.description
     *
     * @return the value of application.description
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.description
     *
     * @param description the value for application.description
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.add_time
     *
     * @return the value of application.add_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.add_time
     *
     * @param addTime the value for application.add_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column application.update_time
     *
     * @return the value of application.update_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column application.update_time
     *
     * @param updateTime the value for application.update_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}