package com.whoiszxl.state;

import com.whoiszxl.constants.OrderStatusConstants;
import com.whoiszxl.dto.OrderInfoDTO;
import com.whoiszxl.entity.Order;
import com.whoiszxl.service.OrderService;
import com.whoiszxl.utils.DateProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 待发货状态
 * @author whoiszxl
 *
 */
@Component
public class WaitForDeliveryOrderState extends AbstractOrderState {

	@Autowired
	public WaitForDeliveryOrderState(OrderService orderService) {
		super(orderService);
	}

	@Override
	protected Integer getOrderStatus(Order order) {
		return OrderStatusConstants.WAIT_FOR_DELIVERY;
	}

}
