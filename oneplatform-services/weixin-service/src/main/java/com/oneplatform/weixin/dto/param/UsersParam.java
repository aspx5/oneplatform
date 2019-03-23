package com.oneplatform.weixin.dto.param;

import io.swagger.annotations.ApiModelProperty;

/**
 * generated by www.jeesuite.com
 */
public class UsersParam{

    @ApiModelProperty("属性名")
    private Integer id;
    
    @ApiModelProperty("属性名")
    private String username;
    
    @ApiModelProperty("属性名")
    private String mobile;
    
    @ApiModelProperty("属性名")
    private String password;
    
    @ApiModelProperty("属性名")
    private Boolean enabled;
    
    @ApiModelProperty("属性名")
    private java.util.Date createdAt;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }
}