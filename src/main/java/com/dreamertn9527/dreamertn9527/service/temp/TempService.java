package com.dreamertn9527.dreamertn9527.service.temp;

import com.dreamertn9527.dreamertn9527.domain.mysql.TempPo;
import java.util.List;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/11
 */
public interface TempService {
    List<TempPo> find();

    TempPo findById(Long id);
}
