package com.example.api.context;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ScenarioContext {

    private String responseXml;
    private int statusCode;
    
}
