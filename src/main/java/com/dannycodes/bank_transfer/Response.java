package com.dannycodes.bank_transfer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Deque;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {


    private boolean status;
    private String message;
    private Data data;
    private Customer customer;



      private static class Data {

      private String currency;
      private long amount;
      private short fee;
      private short vat;
      private String reference;
      private String payment_reference;
      private String status;
      private String narration;
      private boolean merchant_bears_cost;
      private BankAccount bankAccount;
      }
      private static class BankAccount {

          private String account_name;
          private String account_number;
          private String bank_name;
          private String bank_code;
          private LocalDateTime date;


      }





    }

