package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class FixdiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;
    //고정 할인된 금액

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
           return discountFixAmount;
        }else {
            return 0;
        }
        //VIP 는 1000원 할인 해주고, 다른 친구들은 할인 없이 물건을 사는것
    }
}