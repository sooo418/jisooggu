package com.service.impl;

import com.mapper.TestMapper;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    @Override
    public String getTestService() {
        return testMapper.getTestString();
    }
}
