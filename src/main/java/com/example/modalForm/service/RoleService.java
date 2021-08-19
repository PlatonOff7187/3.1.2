package com.example.modalForm.service;

import com.example.modalForm.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role findByRole(String roleName);
}