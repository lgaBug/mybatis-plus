package com.lga.mpc.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lga.mpc.domain.Department;
import com.lga.mpc.mapper.DepartmentMapper;
import com.lga.mpc.service.IDepartmentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuGaoAn
 * @since 2019-09-28
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
