package com.dannycodes.bank_transfer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    private String account_name ;
    private String  amount;
    private String currency;
    private String  reference ;
    private Customer customer;


}
