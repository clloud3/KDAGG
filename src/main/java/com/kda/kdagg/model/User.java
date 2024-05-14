package com.kda.kdagg.model;

import java.security.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//ORM-> Java(다른언어) Object -> 테이블로 매핑해주는 기술
@Entity // User 클래스가 MySQL에 테이블이 생성 됨
public class User {

	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB 넘버링 전략을 따라감
	private int user_no;
	
	@Column(nullable=false, length=30)
	private String user_id;
	
	@Column(nullable=false, length=100) //해쉬 (비밀번호 암호화)
	private String user_pass;
	
	@Column(nullable=false, length=40)
	private String user_name;
	
	@ColumnDefault("user")
    private String role; //Enum을 쓰는게 좋다
	
	@CreationTimestamp //시간 자동 입력
	private Timestamp create_date;
	
}
