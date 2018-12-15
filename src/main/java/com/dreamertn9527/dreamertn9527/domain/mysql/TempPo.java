package com.dreamertn9527.dreamertn9527.domain.mysql;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/11
 */
@Entity
@Table(name = "temp")
@Data
public class TempPo implements Serializable {

    private static final long serialVersionUID = 5236074111066277940L;

    @Id
    @Column(name = "uid")
    private Long uid;

    @Column(name = "id")
    private Long id;

    @Column(name = "k")
    private String key;

    @Column(name = "v")
    private String val;
}
