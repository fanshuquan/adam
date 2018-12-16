package com.fsq.tigerbrokers.stock.openapi.demo.quote;

import com.tigerbrokers.stock.openapi.client.constant.ApiServiceType;
import com.tigerbrokers.stock.openapi.client.https.client.TigerHttpClient;
import com.tigerbrokers.stock.openapi.client.https.request.TigerHttpRequest;
import com.tigerbrokers.stock.openapi.client.https.response.TigerHttpResponse;
import com.tigerbrokers.stock.openapi.client.struct.enums.KType;
import com.tigerbrokers.stock.openapi.client.struct.enums.Language;
import com.tigerbrokers.stock.openapi.client.struct.enums.Market;
import com.tigerbrokers.stock.openapi.client.struct.enums.TimeLineType;
import com.tigerbrokers.stock.openapi.client.util.builder.QuoteParamBuilder;

import java.util.ArrayList;
import java.util.List;

import static com.fsq.tigerbrokers.stock.openapi.demo.DemoConstants.*;

/**
 * Description:
 * Created by lijiawen on 2018/06/27.
 */
public class QuoteDemo {

  private static TigerHttpClient client = new TigerHttpClient(serverUrl, tigerId, yourPrivateKey, tigerPubKey);

  public static void main(String[] args) {
    QuoteDemo quoteDemo = new QuoteDemo();
//    quoteDemo.getMarket();
//    quoteDemo.allSymbols();
//    quoteDemo.allSymbolNames();
    quoteDemo.getStockBrief();
//    quoteDemo.getStockDetail();
//    quoteDemo.getTimeline();
//    quoteDemo.getHourTradingTimeline();
//    quoteDemo.getKline();
//    quoteDemo.getTradeTick();
  }

  public void getMarket() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.MARKET_STATE);
    String bizContent = QuoteParamBuilder.instance()
        .market(Market.US)
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  public void allSymbols() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.ALL_SYMBOLS);

    String bizContent = QuoteParamBuilder.instance()
        .market(Market.US)
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  public void allSymbolNames() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.ALL_SYMBOL_NAMES);

    String bizContent = QuoteParamBuilder.instance()
        .market(Market.HK)
        .language(Language.en_US)
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  public void getStockBrief() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.BRIEF);

    List<String> symbols = new ArrayList<>();
    symbols.add("00700");
    String bizContent = QuoteParamBuilder.instance()
        .symbols(symbols)
        .market(Market.HK)
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  public void getStockDetail() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.STOCK_DETAIL);

    List<String> symbols = new ArrayList<>();
    symbols.add("01810");
    symbols.add("02100");
    symbols.add("03100");
    String bizContent = QuoteParamBuilder.instance()
        .symbols(symbols)
        .market(Market.HK)
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  public void getTimeline() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.TIMELINE);

    String bizContent = QuoteParamBuilder.instance()
        .symbol("00700")
        .market(Market.HK)
        .period(TimeLineType.day)
        .beginTime("2018-05-10")
        .hourTrading(false)
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  public void getHourTradingTimeline() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.HOUR_TRADING_TIMELINE);

    String bizContent = QuoteParamBuilder.instance()
        .symbol("AAPL")
        .market(Market.US)
        .beginTime("2018-07-01")
        .language(Language.zh_CN)
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  public void getKline() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.KLINE);

    String bizContent = QuoteParamBuilder.instance()
        .symbol("AAPL")
        .market(Market.US)
        .period(KType.week)
        .beginTime("2018-07-02")
        .limit(20)
        .right("br")
        .buildJson();
    request.setBizContent(bizContent);

    TigerHttpResponse response = client.execute(request);
    outputResponse(bizContent, response);
  }

  public void getTradeTick() {
    TigerHttpRequest request = new TigerHttpRequest(ApiServiceType.TRADE_TICK);

    List<String> symbols = new ArrayList<>();
    String bizContent = QuoteParamBuilder.instance()
        .symbols(symbols)
        .market(Market.HK)
        .limit(20)
        .beginIndex(0)
        .endIndex(10)
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
