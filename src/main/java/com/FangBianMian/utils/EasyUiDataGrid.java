package com.FangBianMian.utils;

import java.util.List;

import org.apache.poi.hssf.record.formula.functions.T;

@SuppressWarnings("hiding")
public class EasyUiDataGrid<T> {

	private Integer total; //�ܼ�¼��
	private List<T> rows; //����
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
