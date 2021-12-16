package com.sbs.exam.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {
	
		private int id;
		private String regDate;
		private String updateDate;
		private String loginId;
		private String loginPw;
		private String authLeve;
		private String name;
		private String nickname;
		private String cellphoneNo;
		private String email;
		private boolean delStatus;
		private String delDate;
}
