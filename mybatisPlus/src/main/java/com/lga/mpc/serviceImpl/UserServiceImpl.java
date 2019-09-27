package com.lga.mpc.serviceImpl;

import com.lga.mpc.domain.User;
import com.lga.mpc.mapper.UserMapper;
import com.lga.mpc.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuGaoAn
 * @since 2019-09-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
