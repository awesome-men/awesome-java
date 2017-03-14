package com.awesome_java.jdk.java.beans;

import org.junit.Test;

import java.beans.BeanDescriptor;

import static org.junit.Assert.*;

/**
 * Created by shimei on 2017/3/14.
 */
public class BeanDescriptorStartTest {
    @Test
    public void startAll() throws Exception {
        BeanDescriptor beanDescriptor = new BeanDescriptor(BeanModel.class);
        System.err.println(beanDescriptor);

        beanDescriptor.setValue("id", 1);
        beanDescriptor.setValue("name", "namevalue");

        System.err.println(beanDescriptor);
        System.err.println(beanDescriptor.getValue("id"));
        System.err.println(beanDescriptor.getValue("name"));
    }

}