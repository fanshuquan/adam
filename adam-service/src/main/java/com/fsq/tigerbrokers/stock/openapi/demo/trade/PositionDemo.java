package com.fsq.tigerbrokers.stock.openapi.demo.trade;

import com.tigerbrokers.stock.openapi.client.constant.ApiServiceType;
import com.tigerbrokers.stock.openapi.client.https.client.TigerHttpClient;
import com.tigerbrokers.stock.openapi.client.https.request.TigerHttpRequest;
import com.tigerbrokers.stock.openapi.client.https.response.TigerHttpResponse;
import com.tigerbrokers.stock.openapi.client.struct.enums.Currency;
import com.tigerbrokers.stock.openapi.client.struct.enums.Market;
import com.tigerbrokers.stock.openapi.client.struct.enums.SecType;
import com.tigerbrokers.stock.openapi.client.util.builder.AccountParamBuilder;

import java.util.ArrayList;
import java.util.List;

import static com.fsq.tigerbrokers.stock.openapi.demo.DemoConstants.*;

/**
 * Description:
 * Created by lijiawen on 2018/05/31.
 */
public class PositionDemo {

  private static TigerHttpClient client = new TigerHttpClient(serverUrl, tigerId, yourPrivateKey, tigerPubKey);

  public static void main(String[] args) {
    PositionDemo positionDemo = new PositionDemo();
    positionDemo.queryPosition();
  }

  public void queryPosition() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.POSITIONS);
    List<String> subAccounts = new ArrayList<>();
    subAccounts.add("DU1003981");
    subAccounts.add("DU1003980");
    String bizContent = AccountParamBuilder.instance()
        .account("DF1003979")
        .currency(Currency.USD)
        .market(Market.US)
        .symbol("AAPL")
        .secType(SecType.STK)
        .subAccounts(subAccounts)
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
