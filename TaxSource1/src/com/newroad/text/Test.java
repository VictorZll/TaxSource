package com.newroad.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {
	public static void main(String[] args) {
		//SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		//String date=sdf.format(new Date());
		//System.out.println(date);
		
//		String sql="SELECT * FROM tb_tax_payer WHERE payerCode=? OR payerName like ?"+"";
//		Object[] values= {"1005","小米科技"};
//		List<Map<String, String>> list= DBUtil.query(sql, values);
//		System.out.println(list.size());
		
		//将String类型的数据转化为date
		String dateString="2019-12-2";
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
		try {
			Date date=sdf.parse(dateString);
			System.out.println(sdf.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
