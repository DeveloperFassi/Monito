package com.cooper.entities;

import java.util.List;

public class DataTable<T> {
		private int draw;
	    private int start;
	    private long recordsTotal;
	    private long recordsFiltered;
	    private List<T> data;
	    
		public int getDraw() {
			return draw;
		}
		public void setDraw(int draw) {
			this.draw = draw;
		}
		public int getStart() {
			return start;
		}
		public void setStart(int start) {
			this.start = start;
		}
		public long getRecordsTotal() {
			return recordsTotal;
		}
		public void setRecordsTotal(long recordsTotal) {
			this.recordsTotal = recordsTotal;
		}
		public long getRecordsFiltered() {
			return recordsFiltered;
		}
		public void setRecordsFiltered(long recordsFiltered) {
			this.recordsFiltered = recordsFiltered;
		}
		public List<T> getData() {
			return data;
		}
		public void setData(List<T> data) {
			this.data = data;
		}
		public DataTable(int draw, int start, long recordsTotal, long recordsFiltered, List<T> data) {
			super();
			this.draw = draw;
			this.start = start;
			this.recordsTotal = recordsTotal;
			this.recordsFiltered = recordsFiltered;
			this.data = data;
		}
		public DataTable() {
			super();
			// TODO Auto-generated constructor stub
		}

}
