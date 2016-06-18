package com.segeon.chinchilla.server.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by segeon on 16-6-5.
 */
@ConfigurationProperties(prefix = "chinchilla.datasource")
public class DataSourceProperties {

    /**
     * the database url
     */
    private String jdbcUrl;

    /**
     * the database username
     */
    private String username;

    /**
     * the database password
     */
    private String password;

    /**
     * the maximum active connections to db
     */
    private int maxActive = 50;

    /**
     * the minimal idle db connections in the connection pool
     */
    private int minIdle = 1;

    /**
     * the maximum time to wait for a connection to be available, in milliseconds
     */
    private long maxWait = 60 * 1000;

    /**
     * the time interval at which the idle-connection-eviction process runs, in milliseconds
     */
    private long timeBetweenEvictionRunsMillis = 60 * 1000;

    /**
     * the minimal amount of time to be idle for a connection before it's evicted, in milliseconds
     */
    private long minEvictableIdleTimeMillis = 60 * 1000;

    /**
     * the query used to validate connections
     */
    private String validationQuery = "SELECT 'x'";

    /**
     * whether to test connections when idle
     */
    private boolean testWhileIdle = false;

    /**
     * whether to test connections when borrowing
     */
    private boolean testOnBorrow = true;

    /**
     * whether to test on returning
     */
    private boolean testOnReturn = false;

    /**
     * whether to cache prepared statements
     */
    private boolean poolPreparedStatements = false;

    /**
     * maximum cached prepared statements per connection
     */
    private int maxPoolPreparedStatementPerConnectionSize = 20;

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(long maxWait) {
        this.maxWait = maxWait;
    }

    public long getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public long getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }
}
