package com.newroad.manage.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newroad.manage.dao.TaxSourceMapper;
import com.newroad.manage.entity.TaxSource;
import com.newroad.manage.service.TaxSourceServiceIf;
import com.newroad.util.Expression;
import com.newroad.util.MyBatisUtil;
import com.newroad.util.QueryCriteria;
@Service
@Transactional
public class TaxSourceSerrviceImp implements TaxSourceServiceIf {
	SqlSession session=MyBatisUtil.getSession();
	@Resource
	TaxSourceMapper dao;

	@Override
	public boolean addTaxSource(TaxSource t) {
		int num=dao.insertSelective(t);
		session.commit();
	    return num>0?true:false;
	}

	@Override
	public List<TaxSource> listByPage(String pageStr, String rowsStr,String[] conditions) {
		int page=pageStr==null?1:Integer.parseInt(pageStr);
		int rows=rowsStr==null?10:Integer.parseInt(rowsStr);
		if(page<1) {
			page=1;
		}
		//总记录数
		double count=getCount(conditions);
		QueryCriteria qc = getQueryCriteria(conditions);
		//计算总页数
		int pageCount=(int) Math.ceil(count/rows);
		//取整可能取到0，所以判断一下
		pageCount=pageCount>0?pageCount:1;
		if(page>pageCount) {
			page=pageCount;
		}
		//数据合法性
		System.out.println("page="+page);
		int offset=(page-1)*rows;
		List<TaxSource> list=dao.listByPage(offset, rows,qc);
		return list;
	}
	
	private QueryCriteria getQueryCriteria(String[] cds) {
		String payerCode=cds[0];
		String payerName=cds[1];
		String organId=cds[2];
		String industryId=cds[3];
		String beginTime=cds[4];
		String endTime=cds[5];
		Expression e5 =null ;
		if(beginTime!=null && beginTime.length()!=0) {
			e5=Expression.ge("executeTime", beginTime);
		}
		Expression e6 =null ;
		if(endTime!=null && endTime.length()!=0) {
			e6=Expression.le("executeTime", endTime);
		}
		Expression e1 =null ;
		if(payerCode!=null && payerCode.length()!=0) {
			e1 = Expression.eq("payerCode", payerCode);
		}
		Expression e2 =null ;
		if(payerName != null && payerName.length() !=0) {
			e2 = Expression.like("payerName", payerName);
		}
		Expression e3 =null ;
		if(organId!=null && organId.length()!=0) {
			e3 = Expression.like("subOrganId ", organId);
		}
		Expression e4 =null ;
		if(industryId!=null && industryId.length()!=0) {
			e4 = Expression.like("industryId ", industryId);
		}
		QueryCriteria qc = new QueryCriteria();
		if(e1 !=null && e2 !=null&& e3 !=null && e4 !=null && e5 !=null && e6 !=null) {
			qc.add(Expression.or(e1,e2,e3,e4));
			qc.add(Expression.and(e5,e6));
		}
		if(e1!=null){
			qc.add(e1);
		}
		if(e2!=null){
			qc.add(e2);
		}
		if(e3!=null){
			qc.add(e3);
		}
		if(e4!=null){
			qc.add(e4);
		}
		if(e5!=null) {
			qc.add(e5);
		}
		if(e6!=null) {
			qc.add(e6);
		}
		
		if(qc.isEmpty()) {
			return null;
		}
		return qc;
	}



	@Override
	public double getCount(String[] conditions) {
		QueryCriteria qc = getQueryCriteria(conditions);
		
		return dao.getCount(qc);
	}

	@Override
	public boolean addImg(Object[] values) {
		//values->values
		int num=0;
		String[] str1=((String) values[0]).split("--");
		String[] str2=((String) values[1]).split("--");
		for(int i=0;i<3;i++) {
			String url=str1[i];
			String info=str2[i];
			Object[] value= {url,info};
			num+=dao.addImg(value);
			session.commit();
		}
		return num==3?true:false;
	}
	
	@Override
	public boolean remove(String idStr) {
		int id=Integer.parseInt(idStr);
		if(id<0) {
			return false;
		}
		int num=dao.remove(id);
		session.commit();
		return num>0?true:false;
	}

	@Override
	public TaxSource getTaxSourceById(String idStr) {
		int id=Integer.parseInt(idStr);
		TaxSource t=dao.selectByPrimaryKey(id);
		return t;
	}
}
