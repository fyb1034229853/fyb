package com.itheima;


import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;
import sun.misc.Cleaner;

import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.Iterator;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void fun01() {
        WebClient client = WebClient.create("http://localhost:8080/xcf_rs/webservice/userService/user");
        User user = new User();
        user.setAge(18);
        user.setId(1);
        user.setName("范远波");
        client.post(user);

    }

    @Test
    public void fun02() {
        WebClient client = WebClient.create("http://localhost:8080/xcf_rs/webservice/userService/user");
        client.query("id",1);
        client.delete();
    }
    @Test
    public void fun03() {
        WebClient client = WebClient.create("http://localhost:8080/xcf_rs/webservice/userService/user");
        User user = new User();
        user.setAge(18);
        user.setId(1);
        user.setName("范远波");
        client.put(user);
    }
    @Test
    public void fun04() {
        WebClient client = WebClient.create("http://localhost:8080/xcf_rs/webservice/userService/user");
        Collection<? extends User> collection = client.getCollection(User.class);

        for (Iterator<? extends User> iterator = collection.iterator(); iterator.hasNext(); ) {
            User next =  iterator.next();
            System.out.println(next);
        }

    }
    @Test
    public void fun05() {
        WebClient client = WebClient.create("http://localhost:8080/xcf_rs/webservice/userService/user/6");
        User user = client.get(User.class);
        System.out.println(user);
    }
    @Test
    public void fun06() {
        WebClient client = WebClient.create("http://localhost:8080/xcf_rs/webservice/userService/user");
        client.query("id",10);
        User user = client.get(User.class);
        System.out.println(user);
    }
}
