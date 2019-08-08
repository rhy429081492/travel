package com.njust.travel.dao;

import com.njust.travel.entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "agencyDao")
public interface AgencyDao extends JpaRepository<Agency,Integer> {
}
