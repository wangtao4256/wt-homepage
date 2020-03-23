package com.wt.homepage.service.impl;

import com.wt.homepage.service.ThreadService;
import com.wt.homepage.thread.UserThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadServiceImpl implements ThreadService {
    @Override
    public void batchUpdateUser() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new UserThread());
        executorService.submit(new UserThread());
    }
}
