package com.permission.dao;

import java.util.Map;

public interface IUserDao {

	Map<String, Object> LoadUsers(Integer pageindex, Integer pagesize);

}
