package com.food.ordering.system.order.service.domain.valueObject;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(long value) {
        super(value);
    }
}
