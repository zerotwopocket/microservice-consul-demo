package dev.zerotwopocket.account.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@Slf4j
public class AccountController {

  @GetMapping
  public AccountResp zzz() {
    log.info("account controller called");
    return new AccountResp("devidevil", BigDecimal.TEN);
  }

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class AccountResp {
    private String name;
    private BigDecimal credit;
  }
}
