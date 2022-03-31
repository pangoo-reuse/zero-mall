package com.whoiszxl.service;

import com.whoiszxl.cqrs.response.CouponApiResponse;
import com.whoiszxl.cqrs.response.MyCouponApiResponse;
import com.whoiszxl.entity.Coupon;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 优惠券表 服务类
 * </p>
 *
 * @author whoiszxl
 * @since 2022-03-29
 */
public interface CouponService extends IService<Coupon> {

    /**
     * 通过分类ID获取分类下的优惠券列表
     * @param categoryId 分类ID
     * @return 优惠券列表
     */
    List<CouponApiResponse> getCouponByCategoryId(Long categoryId);

    /**
     * 获取全场通用的优惠券列表
     * @return
     */
    List<CouponApiResponse> getCouponAllUnlimited();


    /**
     * 指定优惠券ID领取优惠券
     * @param couponId 优惠券Id
     */
    void receive(Long couponId);

    /**
     * 通过状态获取我的优惠券列表
     * @param status
     * @return
     */
    List<MyCouponApiResponse> myCouponList(Integer status);
}
