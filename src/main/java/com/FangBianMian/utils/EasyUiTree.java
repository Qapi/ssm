package com.FangBianMian.utils;

public class EasyUiTree {

	private Integer id; //��ǰ�ڵ��ID
	private Integer parentId; //���ڵ�ID
	private String text; //��ʾ�ı�
	private String state; //�Ƿ�չ��, open(Ĭ��ֵ) չ��, closed ��չ��
	private boolean checked; //ָʾ�ڵ��Ƿ�ѡ�С�
	private String attributes; //�Զ�������
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getAttributes() {
		return attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}
