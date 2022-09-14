package com.zzd.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzd.server.mapper.EmployeeMapper;
import com.zzd.server.pojo.Employee;
import com.zzd.server.service.IEmployeeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzd
 * @since 2022-09-14
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
