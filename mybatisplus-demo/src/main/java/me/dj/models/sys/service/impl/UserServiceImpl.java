package me.dj.models.sys.service.impl;

import me.dj.models.sys.model.entity.User;
import me.dj.models.sys.mapper.UserMapper;
import me.dj.models.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author tdj
 * @since 2022-10-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
