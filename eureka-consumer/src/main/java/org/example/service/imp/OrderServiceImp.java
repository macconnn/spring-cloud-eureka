package org.example.service.imp;

import org.example.model.ProviderContents;
import org.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    private DiscoveryClient discoveryClient;

    /*
    动态从 Eureka Server 中获取 provider 的 ip 和端口
     1. 注入 DiscoveryClient 对象.激活
     2. 调用方法
    */
    @Override
    public ProviderContents getProviderContents(String providerName) {
        ProviderContents providerContents = new ProviderContents();
        List<ServiceInstance> instances = discoveryClient.getInstances(providerName);  // 不區分大小寫

        if(instances == null || instances.size() == 0){
            return null;
        }

        ServiceInstance instance = instances.get(0);
        providerContents.setHost(instance.getHost());
        providerContents.setPort(instance.getPort());
        return providerContents;
    }

}