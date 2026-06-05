package com.example.api.context;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@Scope("cucumber-glue")
public class ScenarioContext {

  private String responseXml;
  private int statusCode;
}
