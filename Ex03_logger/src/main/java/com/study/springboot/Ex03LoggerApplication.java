package com.study.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
*로그 활용

- 애플리케이션의 흐름을 모니터링 한다.
- 프로그램 코드의 예기치 못한 오류를 포착하는데 도움이 된다.
- 스프링부트 스타터 패키치에는 "별도의 구성없이" 로깅에 쓸 수 있는 로그백이 있다.

> 로깅 수준
: 7개가 있고 설정하면 해당로깅수준 이상이 출력된다
- off : log 출력 off
- fatal : 애플리케이션 실행에 심각한 정도의 오류 (젤 심각)
- error : 애플리케이션의 꽤 심각한 오류 (그 밑에꺼)
- warn: 애플리케이션의 잠재적인 위험이 있는 경우 (원인)
- info : 애플리케이션의 중요한 실행 정보 (기본 값)
- debug : 애플리케이션의 내의 내부 실행에 대한 정보
- trace : 애플리케이션의 내부 실행 내역의 상세 정보(위에 꺼 보다 더 상세)
- all : 모든 로깅 정보

*/
@SpringBootApplication
public class Ex03LoggerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Ex03LoggerApplication.class, args);
		System.out.println("테스트");
	}

}