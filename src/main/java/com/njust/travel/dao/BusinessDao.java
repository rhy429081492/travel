package com.njust.travel.dao;

import com.njust.travel.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "businessDao")
public interface BusinessDao extends JpaRepository<Business,Integer> {
}
