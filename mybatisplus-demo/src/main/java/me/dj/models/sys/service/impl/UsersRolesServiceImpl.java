package me.dj.models.sys.service.impl;

import me.dj.models.sys.model.entity.UsersRoles;
import me.dj.models.sys.mapper.UsersRolesMapper;
import me.dj.models.sys.service.IUsersRolesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2022-09-12
 */
@Service
public class UsersRolesServiceImpl extends ServiceImpl<UsersRolesMapper, UsersRoles> implements IUsersRolesService {

}
