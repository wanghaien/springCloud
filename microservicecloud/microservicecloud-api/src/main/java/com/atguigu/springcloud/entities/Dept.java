package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // ����
	private String 	dname; // ��������
	private String 	db_source;// �����Ǹ����ݿ⣬��Ϊ΢����ܹ�����һ�������Ӧһ�����ݿ⣬ͬһ����Ϣ���洢����ͬ���ݿ�
	
}