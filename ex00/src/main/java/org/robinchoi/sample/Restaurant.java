package org.robinchoi.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/* Spring 프레임워크 시작 (메모리 생성 = ApplicationContext)> root-context.xml에서 객체생성 및 관리 > namespace에서 컴포넌트를 체크 후 경로 설정
   컴포넌트가 스캔 시 자동으로 @Component를 빈으로 등록, 인스턴스 생성 (new 연산자 없이 어노테이션으로 스프링 자체가 관리함 => 컨테이너, 팩토리 기능 ) > @Autowired나 다른 어노테이션 (밑에 후술)에 의존성 주입.

*/

// Setter 주입
//@Setter(onMethod_ = {@Autowired})
// 생성자 주입
//@AllArgsConstructor
// 필드 주입 
//@RequiredArgsConstructor (Spring 5이상)

@Component
@ToString
@RequiredArgsConstructor
public class Restaurant {
		
	
	private final Chef chef;
}
