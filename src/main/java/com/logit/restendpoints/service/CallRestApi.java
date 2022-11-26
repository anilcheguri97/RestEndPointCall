package com.logit.restendpoints.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CallRestApi {
    @Value("${uri1}")
    String path1;
    @Value("${uri2}")
    String path2;
    @Value("${token}")
    String token;

    public void getDatafromRestUrl()
    {
        RestTemplate restTemplate=new RestTemplate();
        for(int i=1;i<=1;i++)
        {
         String url=path1+i+path2+token;
          Object response= restTemplate.exchange(url, HttpMethod.GET,null,Object.class).getBody();
            System.out.println("response is"+response);
        }
    }
}
