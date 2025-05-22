package com.tillu.service;

import com.tillu.model.Home;
import com.tillu.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
