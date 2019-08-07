package com.yanglin.bean;

/**
 * 作者: 杨霖 日期: 2019年8月7日 时间: 上午8:48:41
 */
public class User {

	private int uid;
	private String uname;
	private int age;
	private String sex;
	private String sr;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSr() {
		return sr;
	}

	public void setSr(String sr) {
		this.sr = sr;
	}

	public User(int uid, String uname, int age, String sex, String sr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.age = age;
		this.sex = sex;
		this.sr = sr;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", age=" + age
				+ ", sex=" + sex + ", sr=" + sr + "]";
	}

}
