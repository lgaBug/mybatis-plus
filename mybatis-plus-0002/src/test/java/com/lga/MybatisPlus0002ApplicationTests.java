package com.lga;

import com.lga.mpc.service.IUserService;
import com.lga.mpc.domain.User;
import com.lga.mpc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class MybatisPlus0002ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    @Qualifier("userService")
    private IUserService userService;
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> users = (List<User>) userMapper.selectList(null);
        //Assert.assertEquals(5, users.size());
        //users.forEach(System.out::println);
    }

    @Test
    public void testService(){
        System.out.println("userService.count() = " + userService.count());

        //System.out.println("userService.list() = " + userService.list());
    }

}
