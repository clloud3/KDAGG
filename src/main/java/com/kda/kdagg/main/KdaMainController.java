package com.kda.kdagg.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// spring이 con.kda.kdagg 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것이 아님
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서 (IOC) 스프링 컨테이너에서 관리함
@Controller 
public class KdaMainController {
	

}
