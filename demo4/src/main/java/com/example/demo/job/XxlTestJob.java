package com.example.demo.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class XxlTestJob {



    @XxlJob("handler")
    public void handler()  {
        System.out.println("时间"+new Date());
    }

}
