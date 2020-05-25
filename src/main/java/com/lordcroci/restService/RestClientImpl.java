package com.lordcroci.restService;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class RestClientImpl
{
    Logger log = LoggerFactory.getLogger(RestClientImpl.class);

    private final static String SYMBOL_PARAM_ETH = "fsym=ETH";
    private final static String CURRENCY_PARAM_EUR = "tsyms=EUR";
    private final static String URL_GET_PRICE = "https://min-api.cryptocompare.com/data/price";
    private final static String API_KEY = "9bdefe42d04035d8b9c17c20f5bc68aef8b4822e8cd53de70a0cadfe0ebbe00f";

    public String getEthereumPrice()
    {
        //Create instance of CloseableHttpClient using helper class HttpClients.
        try(CloseableHttpClient client = HttpClients.custom().build())
        {
            //Create a basic GET request
            HttpUriRequest request = RequestBuilder.get()
                    .setUri(URL_GET_PRICE + "?" + SYMBOL_PARAM_ETH + "&" + CURRENCY_PARAM_EUR)
                    .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                    .setHeader("authorization: Apikey", API_KEY)
                    .build();

            //Create a custom response handler
            ResponseHandler<String> responseHandler = response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300)
                {
                    HttpEntity entity = response.getEntity();
                    return entity != null
                            ? EntityUtils.toString(entity)
                            : null;
                }
                else
                {
                    throw new ClientProtocolException("ETH GET PRICE - Unexpected response status code: " + status);
                }
            };
            //Send basic GET request via execute() method
            return client.execute(request, responseHandler);
        }
        catch (IOException e)
        {
            log.error("ETH GET PRICE - Error: {}", e.toString());
        }
        return null;
    }
}
