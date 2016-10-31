package by.borisevich.service.impl;

import by.borisevich.service.WriteMessageService;

/**
 * Created by dima on 10/28/16.
 */
public class WriteMessageServiceImpl implements WriteMessageService {

    public void write(String text) throws Exception {
        System.out.println(text);
    }
}
