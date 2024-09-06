package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;   //10프로 할인
    //고정 할인율

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        } else {
            return 0;
        }
        //VIP는 할인을 10프로 할인을 하고 VIP가 아니면 할인을 안한다
    }
}
