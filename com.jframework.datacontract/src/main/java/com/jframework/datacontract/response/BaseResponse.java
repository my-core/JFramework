package com.jframework.datacontract.response;

import com.jframework.datacontract.common.MC;

public class BaseResponse<T> {

	private boolean isOk = false;
	private String msgCode = "9999";
	private String msgContent = "����ʧ��";
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
		// ����msgCode���Զ�����msgContent,ʡ�¡�
		// ����msgCode��Ӧ��ʾ���뿴MC��
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
