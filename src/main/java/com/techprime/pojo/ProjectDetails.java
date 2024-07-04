//package com.techprime.pojo;
//
//import org.hibernate.annotations.DynamicInsert;
//import org.hibernate.annotations.DynamicUpdate;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//
//public class ProjectDetails {
//	@Entity
//	@DynamicInsert
//	@DynamicUpdate
//	@Table(name = "projects")
//	public class User {
//
//		    @Id
//		    @Column(name="user_id")
//		    @GeneratedValue(strategy = GenerationType.AUTO)
//		    private int userid;
//
//		 
//		    @Column(name="email")
//		    private String email;
//
//}}
