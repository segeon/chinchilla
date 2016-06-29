package com.segeon.chinchilla.server.dal.model;

import java.util.Date;

public class Conf {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.application_id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Integer applicationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.profile_id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Integer profileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.name
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.value
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.enable
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Byte enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.delete_flag
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Byte deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.version
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.attributes
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Long attributes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.add_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column conf.update_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.id
     *
     * @return the value of conf.id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.id
     *
     * @param id the value for conf.id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.application_id
     *
     * @return the value of conf.application_id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.application_id
     *
     * @param applicationId the value for conf.application_id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.profile_id
     *
     * @return the value of conf.profile_id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Integer getProfileId() {
        return profileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.profile_id
     *
     * @param profileId the value for conf.profile_id
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.name
     *
     * @return the value of conf.name
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.name
     *
     * @param name the value for conf.name
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.value
     *
     * @return the value of conf.value
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.value
     *
     * @param value the value for conf.value
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.enable
     *
     * @return the value of conf.enable
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.enable
     *
     * @param enable the value for conf.enable
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.delete_flag
     *
     * @return the value of conf.delete_flag
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.delete_flag
     *
     * @param deleteFlag the value for conf.delete_flag
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.version
     *
     * @return the value of conf.version
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.version
     *
     * @param version the value for conf.version
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.attributes
     *
     * @return the value of conf.attributes
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Long getAttributes() {
        return attributes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.attributes
     *
     * @param attributes the value for conf.attributes
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setAttributes(Long attributes) {
        this.attributes = attributes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.add_time
     *
     * @return the value of conf.add_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.add_time
     *
     * @param addTime the value for conf.add_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column conf.update_time
     *
     * @return the value of conf.update_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column conf.update_time
     *
     * @param updateTime the value for conf.update_time
     *
     * @mbggenerated Wed Jun 29 23:12:06 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}