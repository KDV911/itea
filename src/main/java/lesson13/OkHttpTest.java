package lesson13;

import com.google.gson.Gson;
import lesson13.object.Order;
import okhttp3.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class OkHttpTest {

    private String baseUrl = "https://petstore.swagger.io/v2";

    @Test
    public void okHttpTest() throws IOException {

        Order order = new Order();
        order.setId("0");
        order.setQuantity(0);
//        order.setDate("2021-12-02T17:18:39.685Z");
        order.setStatus("placed");
        order.setComplete("true");

        String jsonObject = new Gson().toJson(order);

        RequestBody requestBody = RequestBody.create(jsonObject.getBytes(StandardCharsets.UTF_8));

        Request request =  new Request.Builder()
                .url(baseUrl + "/store/order")
                    .post(requestBody)
                .header("Content-type", "application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);

        Response response = call.execute();

        Assert.assertEquals(response.code(), 200);
        System.out.println(response.body());


        String rb = response.body().string();
        Order order1 = new Gson().fromJson(rb, Order.class);

        Assert.assertEquals(order.getPetId(), order1.getPetId());
        Assert.assertNotNull(order.getId());

    }
}