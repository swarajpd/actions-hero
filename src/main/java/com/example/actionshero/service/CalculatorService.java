package com.example.actionshero.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CalculatorService {

  public void calculate(int a, int b) {
    log.info("Result = {}", a + b);
  }

}
