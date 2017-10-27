package com.sdhsie.railway.core.mapper.user;

import com.sdhsie.railway.core.model.user.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface UserMapper extends Mapper<User> {
}