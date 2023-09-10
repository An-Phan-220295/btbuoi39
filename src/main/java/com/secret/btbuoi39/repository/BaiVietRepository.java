package com.secret.btbuoi39.repository;

import com.secret.btbuoi39.entity.BaiVietEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiVietEntity,Integer> {
}
