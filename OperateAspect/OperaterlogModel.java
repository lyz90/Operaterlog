

package com.lyz.system.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.lyz.base.model.BaseModel;

import java.util.*;

import com.lyz.system.model.*;
import com.lyz.system.dao.*;
import com.lyz.system.service.*;

/**
 * @author lyz
 * @version 1.0
 * @since 1.0
 */


public class OperaterlogModel implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
		
    /**
     * 主键       db_column: ID 
     */	
/*	@Length(max=20)
*/	private java.lang.String id;
    /**
     * 登录员工号       db_column: USERCODE 
     */	
/*	@Length(max=20)
*/	private java.lang.String usercode;
    /**
     * 登录员姓名       db_column: USERNAME 
     */	
/*	@Length(max=20)
*/	private java.lang.String username;
    /**
     * 模块名称       db_column: MODELNAME 
     */	
/*	@Length(max=50)
*/	private java.lang.String modelname;
    /**
     * 子模块名称       db_column: SUBMODELNAME 
     */	
/*	@Length(max=5)
*/	private java.lang.String submodelname;
    /**
     * 功能名称       db_column: FUNCTIONNAME 
     */	
/*	@Length(max=50)
*/	private java.lang.String functionname;
    /**
     * 业务号       db_column: BNO 
     */	
/*	@Length(max=500)
*/	private java.lang.String bno;
    /**
     * 消息       db_column: MSG 
     */	
/*	@Length(max=500)
*/	private java.lang.String msg;
    /**
     * 创建人       db_column: OPERATOR 
     */	
/*	@Length(max=50)
*/	private java.lang.String operator;
    /**
     * 创建时间       db_column: CREATEDATE 
     */	
/*	
*/	private java.util.Date createdate;
    /**
     * 更新时间       db_column: MODIFYDATE 
     */	
/*	
*/	private java.util.Date modifydate;
    /**
     * 备用1       db_column: BK1 
     */	
/*	@Length(max=500)
*/	private java.lang.String bk1;
    /**
     * 备用1       db_column: BK2 
     */	
/*	@Length(max=500)
*/	private java.lang.String bk2;
    /**
     * 备用2       db_column: BK3 
     */	
/*	@Length(max=500)
*/	private java.lang.String bk3;
	//columns END

	public TbsoperaterlogModel(){
	}

	public TbsoperaterlogModel(
		java.lang.String id
	){
		this.id = id;
	}

		/*	*/
	public void setId(java.lang.String value) {
		this.id = value;
	}
	
	public java.lang.String getId() {
		return this.id;
	}
		/*	*/
	public void setUsercode(java.lang.String value) {
		this.usercode = value;
	}
	
	public java.lang.String getUsercode() {
		return this.usercode;
	}
		/*	*/
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
		/*	*/
	public void setModelname(java.lang.String value) {
		this.modelname = value;
	}
	
	public java.lang.String getModelname() {
		return this.modelname;
	}
		/*	*/
	public void setSubmodelname(java.lang.String value) {
		this.submodelname = value;
	}
	
	public java.lang.String getSubmodelname() {
		return this.submodelname;
	}
		/*	*/
	public void setFunctionname(java.lang.String value) {
		this.functionname = value;
	}
	
	public java.lang.String getFunctionname() {
		return this.functionname;
	}
		/*	*/
	public void setBno(java.lang.String value) {
		this.bno = value;
	}
	
	public java.lang.String getBno() {
		return this.bno;
	}
		/*	*/
	public void setMsg(java.lang.String value) {
		this.msg = value;
	}
	
	public java.lang.String getMsg() {
		return this.msg;
	}
		/*	*/
	public void setOperator(java.lang.String value) {
		this.operator = value;
	}
	
	public java.lang.String getOperator() {
		return this.operator;
	}
	public void setCreatedate(java.util.Date value) {
		this.createdate = value;
	}
	
	public java.util.Date getCreatedate() {
		return this.createdate;
	}
	public void setModifydate(java.util.Date value) {
		this.modifydate = value;
	}
	
	public java.util.Date getModifydate() {
		return this.modifydate;
	}
		/*	*/
	public void setBk1(java.lang.String value) {
		this.bk1 = value;
	}
	
	public java.lang.String getBk1() {
		return this.bk1;
	}
		/*	*/
	public void setBk2(java.lang.String value) {
		this.bk2 = value;
	}
	
	public java.lang.String getBk2() {
		return this.bk2;
	}
		/*	*/
	public void setBk3(java.lang.String value) {
		this.bk3 = value;
	}
	
	public java.lang.String getBk3() {
		return this.bk3;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Usercode",getUsercode())
			.append("Username",getUsername())
			.append("Modelname",getModelname())
			.append("Submodelname",getSubmodelname())
			.append("Functionname",getFunctionname())
			.append("Bno",getBno())
			.append("Msg",getMsg())
			.append("Operator",getOperator())
			.append("Createdate",getCreatedate())
			.append("Modifydate",getModifydate())
			.append("Bk1",getBk1())
			.append("Bk2",getBk2())
			.append("Bk3",getBk3())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TbsoperaterlogModel == false) return false;
		if(this == obj) return true;
		TbsoperaterlogModel other = (TbsoperaterlogModel)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

