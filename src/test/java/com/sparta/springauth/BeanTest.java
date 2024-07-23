package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food; // Bean이 여러개야 그중에 하나 골라
//  Food pizza;


    // Qualifier의 우선순위가 더 높다. 그러나 꼭 Qualifier("")를 꼭 붙여주어야 한다.
    // 따라서 같은타입의 Bean객체가 여러개가 있을경우에는
    // 범용적으로 사용하는 Bean객체에는 Primary를 지역적으로 사용하는 Bean객체에는 Qualifier를 사용한다.
    // Spring 에서는 대부분 좁은범위의 설정이 우선순위가 더 높다 따라서  Qualifier의 우선순위가 더높다.
    @Test
    @DisplayName("Primary와 Qualifier 우선순위 확인")
    void test1(){
        food.eat();
    }

}
