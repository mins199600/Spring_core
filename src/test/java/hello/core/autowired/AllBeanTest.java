package hello.core.autowired;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
import java.util.Map;

public class AllBeanTest {

    @Test
    void findAllBean(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoConfiguration.class, DiscountSertive.class);

        DiscountPolicy discountPolicy = ac.getBean(DiscountPolicy.class);
        Member member = new Member(1L, "userA", Grade.VIP);
       // int discountPrice = DiscountSertive.discount(member,10000,"fixDiscountPolicy");

        //Assertions.assertThat(discountService).isInstanceOf(DiscountSertive.class);
    }

    static class DiscountSertive{
        private final Map<String, DiscountPolicy> policyMap;
        private final List<DiscountPolicy> policies;

        public DiscountSertive(Map<String, DiscountPolicy> policyMap, List<DiscountPolicy> policies) {
            this.policyMap = policyMap;
            this.policies = policies;
            System.out.println("policyMap = " + policyMap);
            System.out.println("policies = " + policies);
        }

       /* public static int discount(Member member, int i, String discountCode) {
           DiscountPolicy discountPolicy = policyMap.get(discountCode);
           return discountPolicy.discount(member,price);
        }*/
    }
}

