package com.hand.city.api.controller.v1;


import com.hand.city.api.dto.CityDTO;
import com.hand.city.app.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 */
@Controller
@RequestMapping("/v1/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    //返回json
    @GetMapping(value = "/all")
    @ResponseBody
    public List<CityDTO> queryAll() {
        return cityService.queryAll();
    }


}
