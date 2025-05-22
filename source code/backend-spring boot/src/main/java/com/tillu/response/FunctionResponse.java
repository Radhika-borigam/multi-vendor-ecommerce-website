package com.tillu.response;

import com.tillu.dto.OrderHistory;
import com.tillu.model.Cart;
import com.tillu.model.Order;
import com.tillu.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
