package com.fsq.tigerbrokers.stock.openapi.demo.trade;

import com.tigerbrokers.stock.openapi.client.constant.ApiServiceType;
import com.tigerbrokers.stock.openapi.client.https.client.TigerHttpClient;
import com.tigerbrokers.stock.openapi.client.https.request.TigerHttpRequest;
import com.tigerbrokers.stock.openapi.client.https.response.TigerHttpResponse;
import com.tigerbrokers.stock.openapi.client.struct.enums.Market;
import com.tigerbrokers.stock.openapi.client.struct.enums.OrderStatus;
import com.tigerbrokers.stock.openapi.client.struct.enums.SecType;
import com.tigerbrokers.stock.openapi.client.util.StringUtils;
import com.tigerbrokers.stock.openapi.client.util.builder.AccountParamBuilder;

import java.util.ArrayList;
import java.util.List;

import static com.fsq.tigerbrokers.stock.openapi.demo.DemoConstants.*;

/**
 * Description:
 * Created by lijiawen on 2018/07/04.
 */
public class GetOrderDemo {

  private static TigerHttpClient client = new TigerHttpClient(serverUrl, tigerId, yourPrivateKey, tigerPubKey);

  public static void main(String[] args) {
    GetOrderDemo demo = new GetOrderDemo();
    demo.getOrders();
  }

  public void getOrders() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.ORDERS);
    List<String> states = new ArrayList<>();
    states.add(String.valueOf(OrderStatus.Inactive.getCode()));
    states.add(String.valueOf(OrderStatus.Cancelled.getCode()));
    List<String> subs = new ArrayList<>();
    subs.add("DU1003980");

    String bizContent = AccountParamBuilder.instance()
        .account("DF1003979")
        .subAccounts(subs)
        .startDate("2018-07-21")
        .endDate("2018-07-28")
        .secType(SecType.STK)
        .market(Market.US)
        .states(states)
        .isBrief(false)
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  private void outputResponse(String param, TigerHttpResponse response) {
    if (response != null) {
      System.out.println("request success,param:" + param + ",result:" + response);
    } else {
      System.out.println("request failure,param:" + param);
    }
  }
}
