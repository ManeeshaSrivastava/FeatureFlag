package com.example.demo;


import com.azure.spring.cloud.feature.management.FeatureManager;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ToggleController {

    private final FeatureManager featureManager;

    ToggleController(FeatureManager featureManager){
        this.featureManager = featureManager;
    }
    @GetMapping(value = "/validate")
    public void processVerificationRequestV2() {
     boolean featureEnable =  featureManager.isEnabledAsync("lexisnexisflagenabled").block();
    }


}
