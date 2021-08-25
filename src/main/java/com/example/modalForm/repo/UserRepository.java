package com.example.modalForm.repo;

import com.example.modalForm.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u join fetch u.roles where u.userName = :username") //заменяет FetchType.EAGER в модели
    User findUserByUsernameFetchRoles(@Param("username") String username);

    @Query("select u from User u join fetch u.roles where u.id = :id")
    User findByIdFetchRoles(@Param("id") Integer id);

}