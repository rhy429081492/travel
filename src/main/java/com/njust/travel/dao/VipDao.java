package com.njust.travel.dao;

import com.njust.travel.entity.Vip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "vipDao")
public interface VipDao extends JpaRepository<Vip, Integer> {
}
