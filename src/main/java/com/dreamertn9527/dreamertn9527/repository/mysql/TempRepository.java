package com.dreamertn9527.dreamertn9527.repository.mysql;

import com.dreamertn9527.dreamertn9527.domain.mysql.TempPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/11
 */
@Repository
public interface TempRepository extends JpaRepository<TempPo, Long>, JpaSpecificationExecutor {

    @Override
    List<TempPo> findAll();
}
