package com.briup.cms.common.test;

import com.briup.cms.common.ConnectionFactory;

public class ConnTeat {
	public static void main(String[] args) {
			System.out.println(ConnectionFactory.getConn()+"连接数据库成功");
		}
}
