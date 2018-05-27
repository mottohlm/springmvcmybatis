package com.hlm.bo;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * <ul>Users : ��Ӧhlm_users ���ʵ��</ul>
 * <li>id:����</li>
 * <li>userCode:�û�Ψһʶ����</li>
 * <li>userName:�û�����</li>
 * <li>sex:�Ա�</li>
 * <li>token:ע�����ƣ��ֻ�������</li>
 * <li>tokenType:�������͡�0Ϊ�ֻ���1Ϊ����</li>
 * <li>createTime:ע��ʱ��</li>
 * <li>password:����</li>
 * </p>
 * @author hlm
 *
 */
public class Users implements Serializable{

	private static final long serialVersionUID = -3452179176154022411L;
	private Long id ;
	private String userCode ;
	private String userName ;
	private Integer sex ;
	private String token ;
	private Integer tokenType;
	private Date createTime ;
	private String password ;
	
	public Users(){
		
	}	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Integer getTokenType() {
		return tokenType;
	}
	public void setTokenType(Integer tokenType) {
		this.tokenType = tokenType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
}
