package com.lyz.system.service.impl;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.lyz.commons.utils.ConstantUtil;
import com.lyz.commons.utils.MethodUtil;
import com.lyz.commons.utils.SessionUtil;
import com.lyz.system.dao.OperaterlogMapper;
import com.lyz.system.model.OperaterlogModel;

/**
 * 
 * <br>
 * <b>功能：操作日志
 */
@Aspect
public class OperaterlogServiceImpl{
	private static  MethodUtil util = new MethodUtil();

	private final static Logger log= Logger.getLogger(OperaterlogServiceImpl.class);
	
	@Autowired
    private OperaterlogServiceImplMapper mapper;
		
	public OperaterlogServiceImplMapper getMapper() {
	    return mapper;
	}
	
	
	@After(value="execution(* com.lyz.system.service.impl.*.list(..))")
	public void myAfter(){
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes sra= (ServletRequestAttributes )ra;
		HttpServletRequest rq = sra.getRequest();
		String usercode = (String) SessionUtil.getAttr(rq, "usercode");//获取登陆账号用户代码
		 
	}
	
	@Around("execution(* com.lyz.system.service.impl.*.save(..)) || execution(* com.lyz.system.service.impl.*.up*(..)) || execution(* com.lyz.system.service.impl.*.del*(..))")  
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		ServletRequestAttributes sra= (ServletRequestAttributes )ra;
		HttpServletRequest rq = sra.getRequest();
		Object result = pjp.proceed();
		 
		String usercode = (String) SessionUtil.getAttr(rq, "usercode");//获取登陆账号用户代码
		String uri = rq.getRequestURI();//操作URI
		String id = util.getUid();
		OperaterlogModel operMdel = new OperaterlogModel();
		 
		operMdel.setId(id);
		operMdel.setUsercode(usercode);
		operMdel.setOperator(usercode);
		operMdel.setModelname(uri);
		operMdel.setMsg((String)result);
		operMdel.setCreatedate(new Date());
		 
		mapper.insert(operMdel);
		 
		 
		return result;
	 }

	
}


















