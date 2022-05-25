/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hisp.biometric.util;

import com.google.gson.Gson;

/**
 *
 * @author Ahmed Ifhaam
 */
public class ServerConfiguration {
    String host;
    int port;
    String dhisUrl;
    String sqlViewID;
    String fingerprintStringAttribute;
    String fidAttribute;
    String program_hiv;

    String biometric_user_name;
    String biometric_user_password;
    
    public static ServerConfiguration getDefault(){
        ServerConfiguration sc = new ServerConfiguration();
        sc.host="localhost";
        sc.port=8090;
        sc.dhisUrl="http://localhost:8090/dhis";
        sc.sqlViewID = "Ugohq30jgpi";
        sc.fingerprintStringAttribute ="ySaNYnlAMWL";
        sc.fidAttribute= "ePbX8aM22Nb";
        sc.program_hiv = "L78QzNqadTV";
                
        return sc;
    }
    
    
    public static ServerConfiguration fromJson(String jsonStr){
        return new Gson().fromJson(jsonStr,ServerConfiguration.class);
    }

    public String getFingerprintStringAttribute() {
        return fingerprintStringAttribute;
    }

    public void setFingerprintStringAttribute(String fingerprintStringAttribute) {
        this.fingerprintStringAttribute = fingerprintStringAttribute;
    }

    public String getFidAttribute() {
        return fidAttribute;
    }

    public void setFidAttribute(String fidAttribute) {
        this.fidAttribute = fidAttribute;
    }

    
    
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getSqlViewID() {
        return sqlViewID;
    }

    public void setSqlViewID(String sqlViewID) {
        this.sqlViewID = sqlViewID;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDhisUrl() {
        return dhisUrl;
    }

    public void setDhisUrl(String dhisUrl) {
        this.dhisUrl = dhisUrl;
    }
    
   public String getProgram_hiv() {
        return program_hiv;
    }

    public void setProgram_hiv(String program_hiv) {
        this.program_hiv = program_hiv;
    }

    public String getBiometric_user_name() {
        return biometric_user_name;
    }

    public void setBiometric_user_name(String biometric_user_name) {
        this.biometric_user_name = biometric_user_name;
    }

    public String getBiometric_user_password() {
        return biometric_user_password;
    }

    public void setBiometric_user_password(String biometric_user_password) {
        this.biometric_user_password = biometric_user_password;
    }
    
    @Override

    public String toString(){
        return new Gson().toJson(this);
    }
    
}
