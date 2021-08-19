package com.example.modalForm.service;

import com.example.modalForm.model.Role;
import com.example.modalForm.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findByRole(String roleName) {
        return roleRepository.findByRole(roleName);
    }

}