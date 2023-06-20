package com.dannycodes.bank_transfer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transfer {


     private String account_name ;
    private String  amount;
    private String currency;
    private String  reference ;
    private Customer customer;







}
