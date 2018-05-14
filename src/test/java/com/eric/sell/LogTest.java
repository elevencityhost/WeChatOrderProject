package com.eric.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/13 23:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {


    @Test
    public void test(){
        log.debug("debug:--------------------");
        log.info("info:----------------------");
        log.error("error:--------------------");
    }
}
