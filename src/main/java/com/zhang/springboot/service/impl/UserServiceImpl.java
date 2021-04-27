package com.zhang.springboot.service.impl;

import com.zhang.springboot.entity.User;
import com.zhang.springboot.mapper.UserMapper;
import com.zhang.springboot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xiaozhang
 * @since 2021-04-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
