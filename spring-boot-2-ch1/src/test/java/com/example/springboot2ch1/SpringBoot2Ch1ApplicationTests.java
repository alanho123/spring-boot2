package com.example.springboot2ch1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.BDDAssertions.then;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringBoot2Ch1ApplicationTests {

    @Autowired
    VodSetting vodSetting;

    @Test
    public void vodPropertiesTest() {
        then(vodSetting.getHost()).isEqualToIgnoringCase("localhost");
        then(vodSetting.getPort()).isEqualToIgnoringCase("8888");
        then(vodSetting.getTimeout()).isNotZero();
    }
}
