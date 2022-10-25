package dev.zerotwopocket.customer.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final RestTemplate restTemplate;

    @GetMapping("baseurl")
    public String asfsa(){

        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://account-service", String.class);

        log.info("recevied:{}", forEntity);

        return forEntity.getBody();


    }

    @GetMapping("pathurl")
    public String adsf(){

        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://account-service/account", String.class);

        log.info("recevied:{}", forEntity);

        return forEntity.getBody();
    }
}
