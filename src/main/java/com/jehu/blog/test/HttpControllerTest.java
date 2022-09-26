package com.jehu.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답 (HTML파일?)
//@Controller로 만들면 된다.

//사용자 요청 -> 응답(DATA)

@RestController
public class HttpControllerTest {
	// http://localhost:8080/http/get (select)
	//인터넷 브라우저 요청 ==> 무조건 Get
	@GetMapping("/http/get")
	public String getTest()
	{
			return "GET 요청";
	}
	//http://localhost:8080/http/post (insert)
	@PostMapping("/http/post")
	public String postTest()
	{
			return "POST 요청";
	}
	//http://localhost:8080/http/put (update)
	@PutMapping("/http/put")
	public String putTest()
	{
			return "put요청";
	}
	//http://localhost:8080/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest()
	{
			return "delete 요청";
	}
	
}
