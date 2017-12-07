package com.insaic.kylin.model.kylin.receive;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dongyang on 2017/9/12.
 */
public class UserAuthenticationDetail implements Serializable {
    private static final long serialVersionUID = -8344723799166229379L;

    private String password;

    private String username;

    @JsonProperty("authorities")
    private List<UserAuthenticationAuthoritie> userAuthenticationAuthoritie;

    private String accountNonExpired;

    private String accountNonLocked;

    private String credentialsNonExpired;

    private String enabled;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<UserAuthenticationAuthoritie> getUserAuthenticationAuthoritie() {
        return userAuthenticationAuthoritie;
    }

    public void setUserAuthenticationAuthoritie(List<UserAuthenticationAuthoritie> userAuthenticationAuthoritie) {
        this.userAuthenticationAuthoritie = userAuthenticationAuthoritie;
    }

    public String getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(String accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public String getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(String accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public String getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(String credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

}
