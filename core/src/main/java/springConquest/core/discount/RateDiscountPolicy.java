package springConquest.core.discount;

import org.springframework.stereotype.Component;
import springConquest.core.annotation.MainDiscountPolicy;
import springConquest.core.member.Grade;
import springConquest.core.member.Member;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
