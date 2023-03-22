package com.yjx.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 角色与菜单、接口权限的对应关系
 * </p>
 *
 * @author yjx
 * @since 2023-03-22 07:20:39
 */
@Getter
@Setter
@TableName("t_role_url_permission")
public class RoleUrlPermission {

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 权限id
     */
    @TableField("url_permission_id")
    private Long urlPermissionId;

    /**
     * 角色id
     */
    @TableField("role_id")
    private Long roleId;

    /**
     * 创建时间
     */
    @TableField("insert_time")
    private Date insertTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;


}
