package com.lga.mpc.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lga.mpc.domain.User;
import com.lga.mpc.mapper.UserMapper;
import com.lga.mpc.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuGaoAn
 * @since 2019-09-28
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
