package myspring.di.annot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

//<!-- DI 전략2에 해당하는 Config file -->
//<context:component-scan base-package="myspring.di.annot" />
@ComponentScan(basePackages = {"myspring.di.annot"})

//<!-- values.properties 파일정보를 설정 -->
//<context:property-placeholder location="classpath:values.properties"/>
@PropertySource(value = "classpath:values.properties")

public class HelloBeanConfig {
	public HelloBeanConfig() {
		System.out.println(this.getClass().getName() + " Config클래스 기본생성자 호출됨!");
	}
}
