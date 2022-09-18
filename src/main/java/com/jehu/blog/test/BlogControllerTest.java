package com.jehu.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는것은 아니지만
//특정 어노테이션이 붙어잇는 클래스 파일을 new해서(IOC) 스프링 컨테이너에 관리해준다..
@RestController   
public class BlogControllerTest {
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello MySpring</h1>";
	}
	/*
	 *  패키지 막만들면 안되는 이유..?
	 *  IoC -> 제어의 역전
	 *  Spring이 new해서 만든다. 우리는 하지 않는다
	 *  Because? Singleton + Reference 변수 스프링이 관리하겠다.
	 *  필요한 것들을 메모리 로드 IoC라고 부름 싱글톤 (스프링이 자원을 관리)
	 *  스프링컨테이너에 
	 *  com.jehu.blog 이하의 모든 자료를 다가지고 온다..!(후에 처리가 필요하지만..)
	 *  
	 * */
	
	/*
	 *  Spring yml에 설정을 한다.
	 *  properties는 이제 없어.! 
	 * 
	 **/
}
