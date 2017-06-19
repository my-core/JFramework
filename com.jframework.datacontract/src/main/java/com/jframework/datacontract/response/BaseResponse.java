package com.jframework.datacontract.response;

import com.jframework.datacontract.common.MC;

public class BaseResponse<T> {

	private boolean isOk = false;
	private String msgCode = "9999";
	private String msgContent = "操作失败";
	private T data = null;

	public boolean isOk() {
		return isOk;
	}

	public void setOk(boolean ok) {
		isOk = ok;
	}

	public String getMsgCode() {
		return msgCode;
	}

	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
		// 设置msgCode，自动设置msgContent,省事。
		// 具体msgCode对应提示语请看MC类
		setMsgContent(MC.GetMsgContent(msgCode));
	}

	public String getMsgContent() {
		return msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
