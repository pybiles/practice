package com.yjx.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yjx.dal.entity.Manager;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Set;

/**
 * <p>
 * 内部员工信息 服务类
 * </p>
 *
 * @author yjx
 * @since 2023-03-22 07:20:39
 */
public interface ManagerService extends IService<Manager> {
    Manager checkLogin(String username, String password);
    Page<Manager> pageSearch(Integer currentPage, Integer pageSize, String keyword);

    void deleteManager(Long id);
    Set<Long> getRelationRoleIds(Integer managerId);

    void refreshRelationRoleIds(Long managerId, Long[] roleIds);
}
