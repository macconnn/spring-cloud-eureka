package org.example;

import org.example.model.ProviderContents;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderService orderService;

    @GetMapping("/goods/{id}")
    public Goods findOrderByGoodsId(@PathVariable("id") int id) {
        ProviderContents providerContents = orderService.getProviderContents("EUREKA-PROVIDER");

        String url = String.format("http://%s:%d/goods/findOne/%d",
                providerContents.getHost(), providerContents.getPort(), id);
        Goods goods = restTemplate.getForObject(url, Goods.class);
        return goods;
    }
}