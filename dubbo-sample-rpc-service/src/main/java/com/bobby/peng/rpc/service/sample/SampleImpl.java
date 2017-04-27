package com.bobby.peng.rpc.service.sample;

import com.bobby.peng.rpc.api.sample.Sample;
import org.springframework.stereotype.Service;

/**
 * Created by peng2035 on 2017/4/27.
 */
@Service
public class SampleImpl implements Sample {

    public void print() {
        System.out.println("in sample print");
    }

}
