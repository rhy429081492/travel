package com.njust.travel.dao;

import com.njust.travel.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "adminDao")
public interface AdminDao extends JpaRepository<Admin, Integer> {
}
