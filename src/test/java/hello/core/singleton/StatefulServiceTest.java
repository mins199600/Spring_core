package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

class StatefulServiceTest {
    
    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //A사용자가 만원 주문
        int userAPrice = statefulService1.order("userA",10000);
        //B사용자가 2만원 주문
        int userBPrice = statefulService2.order("userB",20000);


       // int price = statefulService1.getPrice();
        System.out.println("price: " + userAPrice);  //사용자 A가 주문금액을 조회
        System.out.println("price: " + userBPrice);  //사용자 B가 주문금액을 조회

       // Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);

    }
    static class TestConfig{
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}