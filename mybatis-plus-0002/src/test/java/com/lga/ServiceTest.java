package com.lga;

import com.lga.mpc.mapper.DepartmentMapper;
import com.lga.mpc.service.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ServiceTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private IDepartmentService departmentService;
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        System.out.println("departmentMapper.selectList(null) = " + departmentMapper.selectList(null));
        //Assert.assertEquals(5, users.size());
        //users.forEach(System.out::println);
    }

    @Test
    public void testService(){
        System.out.println("departmentService.count() = " + departmentService.count());

        //System.out.println("userService.list() = " + userService.list());
    }

}
