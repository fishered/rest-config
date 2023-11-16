package com.asset.assetrestconfig;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssetRestConfigApplicationTests {

    @Test
    void contextLoads() {
        String s1 = new String("1") + new String("1");
        s1.intern();
        String s2 = "11";
        System.out.println(s1 == s2);
    }

    public static void main(String[] args) {
        String s1 = new String("1") + new String("1");
        s1.intern();
        String s2 = "11";
        System.out.println(s1 == s2);
    }

}
