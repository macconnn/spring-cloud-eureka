package org.example.service;

import org.example.model.ProviderContents;

public interface OrderService {
    ProviderContents getProviderContents(String providerName);
}