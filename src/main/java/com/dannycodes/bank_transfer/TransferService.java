package com.dannycodes.bank_transfer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpClient;

@Service
public class TransferService {

//    @Autowired
//    private TransferRepository transferRepository;



    public Response transferRequest(Request request) throws IOException {
        Response response = null;
       try(CloseableHttpClient httpClient = HttpClients.createDefault()){
           ObjectMapper mapper = new ObjectMapper();

           HttpPost httpPost = new HttpPost("https://api.korapay.com/merchant/api/v1/charges/bank-transfer");

          httpPost.addHeader("Content-type",  "application/json");
           //post.addHeader("Authorization", "Bearer " + paystackSecretKey);
           StringEntity postingString = new StringEntity(mapper.writeValueAsString(request));
           httpPost.setEntity(postingString);
           HttpResponse httpResponse = httpClient.execute(httpPost);

           if(httpResponse.getStatusLine().getStatusCode() == 200){

               String responseJson = EntityUtils.toString(httpResponse.getEntity());


               response = mapper.readValue(responseJson, Response.class);

               System.out.println(responseJson);
               System.out.println(response);
               return response;

           }

       }catch (Exception e){
           System.out.println(e.getMessage());
       }


       return null;


    }


}
