package com.techprime.project.management.pojo;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "user")
public class User {

	    @Id
	    @Column(name="user_id")
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int userid;

	 
	    @Column(name="email")
	    private String email;

	    @Column(name="password")
	    private String password;

		public int getUserid() {
			return userid;
		}

		public void setUserid(int userid) {
			this.userid = userid;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(int userid, String email, String password) {
			super();
			this.userid = userid;
			this.email = email;
			this.password = password;
		}




	
	
}
