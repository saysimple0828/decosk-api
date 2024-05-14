package com.saysimple.axon.model.event;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class OrderConfirmedEvent {
    private final String orderId;
}
