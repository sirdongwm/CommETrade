package com.zhzx.dao.bean.cust;import com.zhzx.dao.bean.BaseBean;public class CustInfo extends BaseBean {		/**	*客户编号	*/	private String id;		/**	*电话	*/	private String phone;		/**	*姓名	*/	private String name;		/**	*密码	*/	private String password;		/**	*头像图片	*/	private String faceurl;		/**	*昵称	*/	private String nickname;		/**	*证件号码	*/	private String idcard;		/**	*证件类型	*/	private String idcardtype;		/**	*电子邮箱	*/	private String email;		/**	*住址	*/	private String address;		/**	*qq号	*/	private String qqno;		/**	*微信号	*/	private String wechatno;		/**	*	*/	private String updatetime;		/**	*是否删除,1:删除，0：不删除	*/	private String isdelete;		/**	*最近一次登陆时间	*/	private String lastedlogintime;			public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getPhone() {	    return this.phone;	}	public void setPhone(String phone) {	    this.phone=phone;	}	public String getName() {	    return this.name;	}	public void setName(String name) {	    this.name=name;	}	public String getPassword() {	    return this.password;	}	public void setPassword(String password) {	    this.password=password;	}	public String getFaceurl() {	    return this.faceurl;	}	public void setFaceurl(String faceurl) {	    this.faceurl=faceurl;	}	public String getNickname() {	    return this.nickname;	}	public void setNickname(String nickname) {	    this.nickname=nickname;	}	public String getIdcard() {	    return this.idcard;	}	public void setIdcard(String idcard) {	    this.idcard=idcard;	}	public String getIdcardtype() {	    return this.idcardtype;	}	public void setIdcardtype(String idcardtype) {	    this.idcardtype=idcardtype;	}	public String getEmail() {	    return this.email;	}	public void setEmail(String email) {	    this.email=email;	}	public String getAddress() {	    return this.address;	}	public void setAddress(String address) {	    this.address=address;	}	public String getQqno() {	    return this.qqno;	}	public void setQqno(String qqno) {	    this.qqno=qqno;	}	public String getWechatno() {	    return this.wechatno;	}	public void setWechatno(String wechatno) {	    this.wechatno=wechatno;	}	public String getUpdatetime() {	    return this.updatetime;	}	public void setUpdatetime(String updatetime) {	    this.updatetime=updatetime;	}	public String getIsdelete() {	    return this.isdelete;	}	public void setIsdelete(String isdelete) {	    this.isdelete=isdelete;	}	public String getLastedlogintime() {	    return this.lastedlogintime;	}	public void setLastedlogintime(String lastedlogintime) {	    this.lastedlogintime=lastedlogintime;	}}