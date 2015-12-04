package com.trojx.wechatcreater.domain;

public class Msg {
	public static final int TYPE_RECEIVED=0;
	public static final int TYPE_SEND=1;
	private String date;
	private String content;
	private int type;
	public Msg(String date,String content,int type) {
		// TODO Auto-generated constructor stub
		this.date=date;
		this.content=content;
		this.type=type;
	}
	public String getContent() {
		return content;
	}
	public int getType() {
		return type;
	}
	public String getDate() {
		return date;
	}
}
