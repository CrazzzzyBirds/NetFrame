package com.heima.netframe.base;

import com.heima.netframe.net.ApiEngine;
import com.heima.netframe.net.ApiService;


public interface BaseModel {
    ApiService mApiService = ApiEngine.getInstance().getApiService();
}
