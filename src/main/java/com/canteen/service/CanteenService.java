package com.canteen.service;


import com.canteen.bean.Canteen;

import java.util.List;

public interface CanteenService {
    Canteen getCanteenById(int id);
    List<Canteen> getAllCanteens();
    Integer addCanteen(Canteen canteen);
    Integer updateCanteen(Canteen canteen);
    Integer deleteCanteen(int id);
}
