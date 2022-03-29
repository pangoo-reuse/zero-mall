package com.whoiszxl.cqrs.response;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 轮播表
 * </p>
 *
 * @author whoiszxl
 * @since 2022-03-29
 */
@Getter
@Setter
@ApiModel(value = "Banner对象", description = "轮播表")
public class BannerResponse implements Serializable {

    @ApiModelProperty("自增主键ID")
    private Long id;

    @ApiModelProperty("轮播图名称")
    private String name;

    @ApiModelProperty("轮播位置:0->PC首页轮播;1->app首页轮播 2->app导航小组件")
    private Integer type;

    @ApiModelProperty("业务ID: spu_id or other")
    private Long bizId;

    @ApiModelProperty("图片地址")
    private String pic;

    @ApiModelProperty("上下线状态:0->下线;1->上线")
    private Integer status;

    @ApiModelProperty("点击数")
    private Integer clickCount;

    @ApiModelProperty("链接地址")
    private String url;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("乐观锁")
    @Version
    private Long version;

    @ApiModelProperty("逻辑删除 1: 已删除， 0: 未删除")
    @TableLogic
    private Integer isDeleted;

    @ApiModelProperty("创建者")
    private String createdBy;

    @ApiModelProperty("更新者")
    private String updatedBy;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;


}
