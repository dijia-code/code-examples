package me.dj.models.sys.service.impl;

import me.dj.models.sys.model.entity.Role;
import me.dj.models.sys.mapper.RoleMapper;
import me.dj.models.sys.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2022-09-12
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
