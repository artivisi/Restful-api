package com.artivisi.server.restful.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/halo")
public class HomeController {
    
    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Object> response() {
        Map<String, Object> objResponse = new HashMap<String, Object>();
        objResponse.put("pesan", "hallo");
        objResponse.put("tanggal", new Date().toString());
    
        return objResponse;
    }
    
}
