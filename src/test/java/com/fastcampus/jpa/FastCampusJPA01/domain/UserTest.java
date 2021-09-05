package com.fastcampus.jpa.FastCampusJPA01.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test(){
        User user1 = new User();
        user1.setEmail("martine@fastcampus.com");
        user1.setName("martin");
        user1.setCreateAt(LocalDateTime.now());
        user1.setUpdateAt(LocalDateTime.now());
        System.out.println(">>>" + user1);//toString을 오버라이딩 하지 않았기 때문에 hash코드 값을 출력한다.
        //자바에서 모든 클래스는 Object를 상속받기 때문에 toString을 오버라이딩 하는것이 좋다.

        User user2 = new User("martine@fastcampus.com","martin",LocalDateTime.now(),LocalDateTime.now());
        User user3 = new User("martine@fastcampus.com","martin");
        //@NonNull과 final 필드가 없을경우 NoargsContruct와 동일하다.
        User user4 = User.builder().name("martin").email("martine@fastcampus.com").build();
        System.out.println(user4);
    }

}