package me.dj.models.sys.service.impl;

import me.dj.models.sys.model.entity.RolesDepts;
import me.dj.models.sys.mapper.RolesDeptsMapper;
import me.dj.models.sys.service.IRolesDeptsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色部门关联 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2022-09-12
 */
@Service
public class RolesDeptsServiceImpl extends ServiceImpl<RolesDeptsMapper, RolesDepts> implements IRolesDeptsService {

}
