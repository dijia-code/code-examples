package me.dj.models.sys.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author tdj
 * @since 2022-10-06
 */
@TableName("sys_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "role_id", type = IdType.AUTO)
    private Long roleId;

    /**
     * 名称
     */
    private String name;

    /**
     * 角色级别，1：超级管理员，2：不同用户
     */
    private Integer level;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 创建日期
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Role{" +
            "roleId = " + roleId +
            ", name = " + name +
            ", level = " + level +
            ", description = " + description +
            ", createBy = " + createBy +
            ", updateBy = " + updateBy +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
