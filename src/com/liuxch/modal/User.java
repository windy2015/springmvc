package com.liuxch.modal;

import java.util.Date;

public class User implements java.io.Serializable{

       /**
        *
        */
       private static final long serialVersionUID = 1L;

       private String user_id;

       private String user_name;

       private String password;

       private String lastIp;

       private Date lastVisit;

       public String getUser_id() {
              return user_id;
       }

       public void setUser_id(String user_id) {
              this.user_id = user_id;
       }

       public String getUser_name() {
              return user_name;
       }

       public void setUser_name(String user_name) {
              this.user_name = user_name;
       }

       public String getPassword() {
              return password;
       }

       public void setPassword(String password) {
              this.password = password;
       }

       public String getLastIp() {
              return lastIp;
       }

       public void setLastIp(String lastIp) {
              this.lastIp = lastIp;
       }

       public Date getLastVisit() {
              return lastVisit;
       }

       public void setLastVisit(Date lastVisit) {
              this.lastVisit = lastVisit;
       }

}

