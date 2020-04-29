//package com.lordcroci.restClientTests;
//
//import org.apache.http.HttpHeaders;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.methods.HttpUriRequest;
//import org.apache.http.client.methods.RequestBuilder;
//import org.apache.http.entity.ContentType;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//
//class RestClientTest {
//
//	final static String SYMBOL_PARAM_ETH = "fsym=ETH";
//	final static String CURRENCY_PARAM_EUR = "tsyms=EUR";
//	final static String URL_GET_PRICE = "https://min-api.cryptocompare.com/data/price";
//	final static String API_KEY = "9bdefe42d04035d8b9c17c20f5bc68aef8b4822e8cd53de70a0cadfe0ebbe00f";
//
//	@Test
//	void givenStandardRequest_whenIsExecuted_thenDefaultResponseContentTypeIsJson()
//			throws ClientProtocolException, IOException
//	{
//		//Given
//		HttpUriRequest request = RequestBuilder.get()
//				.setUri(URL_GET_PRICE + "?" + SYMBOL_PARAM_ETH + "&" + CURRENCY_PARAM_EUR)
//				.setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
//				.setHeader("authorization: Apikey", API_KEY)
//				.build();
//
//		// When
//		HttpResponse response = HttpClientBuilder.create().build().execute(request);
//
//		// Then
//		String mimeType = ContentType.getOrDefault(response.getEntity()).getMimeType();
//		Assertions.assertEquals( "application/json", mimeType );
//	}
//}
