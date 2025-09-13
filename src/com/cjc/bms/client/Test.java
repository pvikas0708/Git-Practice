package com.cjc.bms.client;
import com.cjc.bms.service.RBI;
import com.cjc.bms.serviceImpl.SBI;

public class Test {

	public static void main(String[] args) throws Exception {
		RBI r=new SBI();
		r.createAccount();
	}
}
