package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    //할인 정책이라는 규칙을 정하는 곳이여서 할인이 어떻게 이루어 질지 를 여기서 정한다

    //return이 할인 대상 금액
    int discount(Member member, int price);
    //discount 함수는 두개의 정보를 받는데 멤버(할인 받을 사람), price(물건의 가격)
    //즉, 이 코드는 누군가 물건을 사면, 그 사람에게 얼마를 할인해줄 건지 정하는 규칙

}
