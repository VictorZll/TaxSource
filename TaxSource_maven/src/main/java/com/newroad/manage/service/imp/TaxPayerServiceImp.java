package com.newroad.manage.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newroad.manage.dao.TaxPayerMapper;
import com.newroad.manage.entity.TaxPayer;
import com.newroad.manage.service.TaxPayerServiceIf;
import com.newroad.util.Expression;
import com.newroad.util.MyBatisUtil;
import com.newroad.util.QueryCriteria;
@Service
@Transactional
@SuppressWarnings("serial")
public class TaxPayerServiceImp implements TaxPayerServiceIf {
	//private SqlSession session=MyBatisUtil.getSession();
	@Resource
	private TaxPayerMapper dao;
	@Override
	public List<TaxPayer> listByPage(String pageStr, String rowsStr,String payerCode,String payerName) {
		int page=pageStr==null?1:Integer.parseInt(pageStr);
		int rows=rowsStr==null?10:Integer.parseInt(rowsStr);
		if(page<1) {
			page=1;
		}
		//总记录数
		double count=getCount(payerCode,payerName);
		QueryCriteria qc = getQueryCriteria(payerCode, payerName);
		//计算总页数
		int pageCount=(int) Math.ceil(count/rows);
		//取整可能取到0，所以判断一下
		pageCount=pageCount>0?pageCount:1;
		if(page>pageCount) {
			page=pageCount;
		}
		//数据合法性
		int offset=(page-1)*rows;
		List<TaxPayer> list=dao.listByPage(offset, rows,qc);
		return list;
	}
	@Override
	public int getCount(String payerCode ,String payerName) {
		QueryCriteria qc = getQueryCriteria(payerCode ,payerName);
		return dao.getCount(qc);
	}
	@Override
	public TaxPayer getSingleData(String payerCode) {
		if(payerCode==null) {payerCode="";};
		return dao.querySingleData(payerCode);
	}
	@Override
	public boolean add(TaxPayer taxPayer) {
		int num=dao.insertSelective(taxPayer);
		//session.commit();
		return num>0?true:false;
	}
	@Override
	public boolean remove(String payerCode) {
		int num=dao.remove(payerCode);
		//session.commit();
		return num>0?true:false;
	}
	private QueryCriteria getQueryCriteria(String payerCode ,String payerName) {
		Expression e1 =null ;
		if(payerCode!=null && payerCode.length()!=0) {
			e1 = Expression.eq("payerCode", payerCode);
		}
		Expression e2 =null ;
		if(payerName != null && payerName.length() !=0) {
			e2 = Expression.like("payerName", payerName);
		}
		QueryCriteria qc = null;
		if(e1 !=null && e2 !=null) {
			qc = new QueryCriteria();
			qc.add(Expression.or(e1,e2));
		}else if(e1!=null){
			qc = new QueryCriteria();
			qc.add(e1);
		}else if(e2!=null){
			qc = new QueryCriteria();
			qc.add(e2);
		}
		return qc;
	}
	@Override
	public boolean isRepeat(String payerCode) {
		boolean flage=false;
		if(payerCode!=null&&payerCode.length()!=0) {
			flage= dao.isRepeat(Integer.parseInt(payerCode))!=null?false:true;
		}
		return flage;
	}
	@Override
	public boolean update(TaxPayer taxpayer, String payerCode) {
		taxpayer.setPayercode(payerCode);
		return dao.updateByTaxpayerCode(taxpayer)>0?true:false;
	}
	

}
