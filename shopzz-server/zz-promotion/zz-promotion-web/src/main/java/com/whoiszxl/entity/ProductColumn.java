package com.whoiszxl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 商品专栏表
 * </p>
 *
 * @author whoiszxl
 * @since 2022-03-29
 */
@Getter
@Setter
@TableName("spms_product_column")
@ApiModel(value = "ProductColumn对象", description = "商品专栏表")
public class ProductColumn implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("专栏名称")
    private String name;

    @ApiModelProperty("专栏描述")
    private String descs;

    @ApiModelProperty("入口图片地址")
    private String enterImg;

    @ApiModelProperty("内部banner图片地址")
    private String bannerImg;

    @ApiModelProperty("上下线状态:0->下线;1->上线")
    private Integer status;

    @ApiModelProperty("点击数")
    private Integer clickCount;

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
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedAt;


}
