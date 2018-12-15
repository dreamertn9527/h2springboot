package com.dreamertn9527.dreamertn9527.domain.mysql;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 类描述: 礼包活动
 *
 * @author tangniannian
 * @date 2018/7/28
 */
@Data
@Entity
@Table(name = "gift_activity")
public class GiftActivityPo implements Serializable {

    private static final long serialVersionUID = 8439054287393501917L;
    /**
     * 活动id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 组件化活动id
     */
    @Column(name = "rf_id")
    private Long rfId;
    /**
     * 商家ID
     */
    @Column(name = "vender_id")
    private Long venderId;
    /**
     * 活动名称
     */
    private String name;
    /**
     * 活动副标题
     */
    @Column(name = "subtitle_name")
    private String subtitleName;
    /**
     * 活动开始时间
     */
    @Column(name = "start_time")
    private Date startTime;
    /**
     * 活动结束时间
     */
    @Column(name = "end_time")
    private Date endTime;
    /**
     * 活动状态 1. 正在创建中 2. 已经创建 3. 活动进行中
     *         4. 活动已经取消 5. 活动关闭 6. 活动创建异常
     */
    private Integer status;
    /**
     * 用户人群modelIds
     */
    @Column(name = "model_ids")
    private String modelIds;
    /**
     * 用户人群taskIds
     */
    @Column(name = "task_ids")
    private String taskIds;
    /**
     * 创建活动的pin
     */
    private String creator;
    /**
     * 修改用户pin
     */
    private String modifier;
    /**
     * 系统来源
     */
    private Integer source;
    /**
     * 活动创建时间
     */
    private Date created;
    /**
     * 活动更新时间
     */
    private Date modified;
    /**
     * 活动类型： 1-官方，2-ISV活动，3-投票有礼, 4-评论有礼
     */
    private Integer type;
    /**
     * 是否有奖：0 无奖 1 有奖
     */
    @Column(name = "is_prize")
    private Integer isPrize;
    /**
     * 其他活动插件名称
     */
    @Column(name = "source_name")
    private String sourceName;
    /**
     * 活动关闭连接
     */
    @Column(name = "source_close_link")
    private String sourceCloseLink;
    /**
     * 活动连接
     */
    @Column(name = "source_link")
    private String sourceLink;
    /**
     * 活动主图连接
     */
    @Column(name = "picture_link")
    private String pictureLink;
    /**
     * 插件有效期
     */
    private Date validate;
    /**
     * 是否是单独奖项(单独奖项在同一个活动中，同一个pin可以领取多种类型奖项)
     * 0或null(默认): 同一个活动，一个pin只能领取一次
     * 1：是单独奖项：单独奖项在同一个活动中，同一个pin可以领取多种类型奖项
     */
    @Column(name = "is_single_prize")
    private Integer isSinglePrize;

    /**
     * 是否每天发放
     * 0或null: 默认为活动维度发放，一个活动中，一个Pin只能领取一次
     * 1: 按照每天发放
     */
    @Column(name = "is_everyday_award")
    private Integer isEverydayAward;
}
