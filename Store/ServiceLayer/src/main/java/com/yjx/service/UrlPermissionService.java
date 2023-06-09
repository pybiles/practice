package com.yjx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yjx.dal.model.PermissionMenu;
import com.yjx.dal.entity.UrlPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 菜单和接口权限定义 服务类
 * </p>
 *
 * @author yjx
 * @since 2023-03-22 07:20:39
 */
public interface UrlPermissionService extends IService<UrlPermission> {
    List<PermissionMenu> getAllRootMenuBySql();
    List<PermissionMenu> getAllRootMenuByMap();
    Page<UrlPermission> pageSearch(Integer currentPage, Integer pageSize, String keyword);
    void deleteById(Long urlPermissionId);

    List<PermissionMenu> allOfCurrentUser(String username);
}
