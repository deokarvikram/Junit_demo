package com.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoUtil {

    private String academy="This is academy";
    private String duplicate=academy;
    private String[] arr={"A","B","C"};
    private String[] alist={"Love","2","Code"};
    private ArrayList<String> list=new ArrayList<String>();


    public String[] getArray()
    {
        return arr;
    }

    public List<String> getList()
    {

        return Arrays.asList(alist);
    }

    public int multiply(int no1,int no2)
    {
        return no1*no2;
    }

    public int throwException(int no) throws Exception {
        if(no<0)
            throw new Exception("Values should be greater than 0");
        return no;
    }

    public void timeOut() throws InterruptedException {
        System.out.println("I am going to sleep");
        Thread.sleep(2000);;
        System.out.println("I'm woke up");
    }


    public String getAcademy()
    {
        return academy;
    }

    public String getDuplicate()
    {

        return duplicate;
    }

    public boolean isGreater(int n1,int n2)
    {
        return n1>n2;
    }


    public int add(int a, int b)
    {
        return a+b;
    }

    public Object nullNotNull(Object o)
    {
        if(o!=null)
            return o;

        return null;
    }
}
