package com.bootiful.framework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import th.co.geniustree.springdata.jpa.repository.JpaSpecificationExecutorWithProjection;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>, JpaSpecificationExecutorWithProjection<T> {
}
