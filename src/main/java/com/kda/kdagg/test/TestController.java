package com.kda.kdagg.test;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응담(HTML 파일)
// @Controller

// 사용자가 요청 -> 응담(Data)
@RestController
public class TestController {
	
	private static final String TAG="TestController:";
	
	//localhost:8000/kdagg/http/lombok
	@GetMapping("/http/lombok")
	public String lobokTest() {
		Member m= Member.builder().username("pass").password("2345").email("test@naver.com").build();
		System.out.println(TAG+"getter: "+m.getUsername());
		m.setUsername("sejun");
		System.out.println(TAG+"setter: "+m.getUsername());
		return "lombok test 완료";
		
	}
	
	// 인터넷 브라우저 요청은 get 요청 밖에 할 수 없다
	//http://localhost:8080/http/get (select)
	@GetMapping("/http/get2")
	public String getTest2(@RequestParam int id, @RequestParam String username) {
		return "get 요청 : "+id+", "+username;
	}
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청 : "+m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	//http://localhost:8080/http/post (insert)
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member m) { //MessageConverter (스피링부트)
		return "post 요청 : "+m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	//http://localhost:8080/http/put (update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청 : "+m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	//http://localhost:8080/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
