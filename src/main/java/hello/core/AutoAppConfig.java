package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "hello.core.member",
                basePackageClasses = AutoAppConfig.class,
                excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
//컴포넌트 가 붙은 모든 클래스를 스프링 빈으로 등록해줌
public class AutoAppConfig {
}
