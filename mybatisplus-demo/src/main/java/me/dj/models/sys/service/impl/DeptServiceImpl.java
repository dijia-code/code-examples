package me.dj.models.sys.service.impl;

import me.dj.models.sys.model.entity.Dept;
import me.dj.models.sys.mapper.DeptMapper;
import me.dj.models.sys.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2022-09-12
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
