package com.monster.sb.demo.app.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListModel {


        public final List<UserModel> users;

        public UserListModel(List<UserModel> userList) {
            users = userList;
    }
}
