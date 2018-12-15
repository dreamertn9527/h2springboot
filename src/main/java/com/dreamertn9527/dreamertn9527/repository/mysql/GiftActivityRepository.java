package com.dreamertn9527.dreamertn9527.repository.mysql;

import com.dreamertn9527.dreamertn9527.domain.mysql.GiftActivityPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/10
 */
@Repository
public interface GiftActivityRepository extends JpaRepository<GiftActivityPo, Long>, JpaSpecificationExecutor {

    GiftActivityPo findById(Long id);

}
