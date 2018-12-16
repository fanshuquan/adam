package com.fsq.tigerbrokers.stock.openapi.demo;

/**
 * Description:
 * Created by lijiawen on 2018/07/25.
 */
public final class DemoConstants {

  /**
   * 线上http接口地址
   */
  public static String serverUrl = "https://openapi.itiger.com/gateway";

  /**
   * 线上消息推送接口地址
   */
  public static String webSocketServerUrl = "wss://openapi.itiger.com:8883";

  /**
   * 参数必填,tigerId : 形如2015xxxx,查询地址：https://www.itiger.com/openapi/info
   */
  public static String tigerId = "20150098";

  /**
   * 参数必填,yourPrivateKey : 开发者注册时生成的私钥
   * 生成方式 : https://openapi.itiger.com/docs/intro/contract/#rsa
   * 如果报错,可以比对下下面的私钥实例 testPrivateKey 或者 testPrivateKey1(去除了头尾、换行和空格)
   */
  public static String yourPrivateKey = "-----BEGIN PRIVATE KEY-----\n" +
          "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAL/X0zX4bQjKIHjI\n" +
          "90R2kpfw8OelL5Zm8eCrO5G70Im7Yrsb0so86JXStSl8rP59pw4wI71jngiv48Db\n" +
          "4VdHLHMF5R0F7UYql2C5XOKmsuLfFrfiu4pGx8Wo5T9rIJqJMj9AwmaCfbB08TZo\n" +
          "mv1gYgPAY98vhuiZIwH9hLAHmuG5AgMBAAECgYBcnX4rBQbmgmZQyXyOQcwdrEUx\n" +
          "H88shgBpnWEBxzEy/RL6D8GgvuzuP64UHEuMBO9cayMl8Gy/9uI2HjDYqNSs0Mi/\n" +
          "rLJTcqsihLR83JAQEUcEeEKnnGvUr0vO6TaXED5o+qL842Dtrgs48LV6K6aGMhq9\n" +
          "APPiWGIxv7NZD5+fgQJBAOhpwazCQyUhW2dCuhyyVunyZLwaCBIvSE0oFQxRiKj6\n" +
          "yy9i7o878rg18o1Y85c6Crzvw8bl5xZKweCV+KyGDdECQQDTUAhLungR4FzrD0dy\n" +
          "hZg4oW0W3Ce+jGRxvDFgkZcNM0bH1OB6fvWVXkOXC4tf6lOVClx7NRkirwABtF0l\n" +
          "dodpAkEAhbAfygJMoVUYwMMvT0Z+nD/kFhdbQSqVilxeDyHvXFQ3AGEGHLo9Gh1e\n" +
          "ElRyejDW8Gty0Dx6uuXxtABQdNz/oQJAR+51dHncR5GNb8K6uoQ5hgWFYgO9T8Lw\n" +
          "qjq6wDmvJqIu1PVlGK3BIYB+F5upbRQSMajeRF6V2NWjdfEUyBzqCQJAEbPm5AnX\n" +
          "4QogOLld/FIrmYrwQ3JcuGeSzTuxFyKkfvXKyytimkYlJucX9qoSkUZL14MK0w2e\n" +
          "LKwYq902X3XFxw==" +
          "-----END PRIVATE KEY-----";

  public static String testPrivateKey = "-----BEGIN PRIVATE KEY-----\n"
      + "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKTzk6nb3/T+1R7D\n"
      + "nolE0QXXOWaiYfa6jySJAsWnpdLUtw/hUXvfuMEU/0wwflHyW61qgbG3TlCoHVkn\n"
      + "qMGTuOoP69FaeBd0CRTUtve9udy7h508mBN2hYcj/qbIeauQ3+aYYnFpmiXK0BJS\n"
      + "iVhmRk4WWWO01T6BO/0ssWaoMxTNAgMBAAECgYEAmDDQdjETEmWo1yif9oDS5jOs\n"
      + "l2CNSGratVfggeNrYPm4KWO3nbZOLX+lCXPYqN0W7wrMvN6m2E40PdUUo/4a5gca\n"
      + "xI08Qx6ZIddaO49/AbTES7+slPtLKctCBWBEIOv29Mx7JcW1/TNoQn9deiZhmDT3\n"
      + "qXrCFjx71Dw/0U4SULUCQQDSZPWF152J4F1w0Kd7WK/fK5x6iJTXU/shC1XB5kHm\n"
      + "QWfjmoDliB7had1P6r6GPxvQAUMTnWu6foPSA4B3ba9bAkEAyLTviMWuPErDFOpI\n"
      + "/KbzQgCcoGjZPrpN0hpG1XvY3EBgUacupFuUZpjA+E5qpPby+nbE6bwl6mRXxJBz\n"
      + "i9Xs9wJAfbJXhTkGI8Npz+a4yNZ5bElv2T0UP3krBdjxyUA5isj0umQqMfebC2zm\n"
      + "DcLfRPEbOrAmVOet3uOK+cOh0rgzFQJAbARs0fhJ8GrwGOaKR2d2jfQUV4R2Pvs3\n"
      + "fLblnmmb6dW/wNIwGQaslJbra/eQD55UYJXhHkZDRaWhUsnHVd/ZOwJBAM5xgnoW\n"
      + "u0XDVuD5MYCkfB+V0IuWCDybNEGl/4fqLmvoVIqSGrI4+2qnQXHJzSO4TB/9/ycr\n"
      + "c24uxxEELyJXzPc=\n"
      + "-----END PRIVATE KEY-----";

  public static String testPrivateKey1 =
      "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKTzk6nb3/T+1R7D"
          + "nolE0QXXOWaiYfa6jySJAsWnpdLUtw/hUXvfuMEU/0wwflHyW61qgbG3TlCoHVkn"
          + "qMGTuOoP69FaeBd0CRTUtve9udy7h508mBN2hYcj/qbIeauQ3+aYYnFpmiXK0BJS"
          + "iVhmRk4WWWO01T6BO/0ssWaoMxTNAgMBAAECgYEAmDDQdjETEmWo1yif9oDS5jOs"
          + "l2CNSGratVfggeNrYPm4KWO3nbZOLX+lCXPYqN0W7wrMvN6m2E40PdUUo/4a5gca"
          + "xI08Qx6ZIddaO49/AbTES7+slPtLKctCBWBEIOv29Mx7JcW1/TNoQn9deiZhmDT3"
          + "qXrCFjx71Dw/0U4SULUCQQDSZPWF152J4F1w0Kd7WK/fK5x6iJTXU/shC1XB5kHm"
          + "QWfjmoDliB7had1P6r6GPxvQAUMTnWu6foPSA4B3ba9bAkEAyLTviMWuPErDFOpI"
          + "/KbzQgCcoGjZPrpN0hpG1XvY3EBgUacupFuUZpjA+E5qpPby+nbE6bwl6mRXxJBz"
          + "i9Xs9wJAfbJXhTkGI8Npz+a4yNZ5bElv2T0UP3krBdjxyUA5isj0umQqMfebC2zm"
          + "DcLfRPEbOrAmVOet3uOK+cOh0rgzFQJAbARs0fhJ8GrwGOaKR2d2jfQUV4R2Pvs3"
          + "fLblnmmb6dW/wNIwGQaslJbra/eQD55UYJXhHkZDRaWhUsnHVd/ZOwJBAM5xgnoW"
          + "u0XDVuD5MYCkfB+V0IuWCDybNEGl/4fqLmvoVIqSGrI4+2qnQXHJzSO4TB/9/ycr"
          + "c24uxxEELyJXzPc=";

  public static String tigerPubKey =
      "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDNF3G8SoEcCZh2rshUbayDgLLrj6rKgzNMxDL2HSnKcB0+GPOsndqSv+a4IBu9+I3fyBp5hkyMMG2+AXugd9pMpy6VxJxlNjhX1MYbNTZJUT4nudki4uh+LMOkIBHOceGNXjgB+cXqmlUnjlqha/HgboeHSnSgpM3dKSJQlIOsDwIDAQAB";
}
