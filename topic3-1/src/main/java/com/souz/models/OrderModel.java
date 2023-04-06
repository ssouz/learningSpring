package com.souz.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class OrderModel {

    Long id =0L;
    String orderNo = "";
    String productName = "";
    float price = 0;
    int quantity = 0;

}
