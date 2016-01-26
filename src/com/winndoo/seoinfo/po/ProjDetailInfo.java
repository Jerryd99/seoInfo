package com.winndoo.seoinfo.po;

import java.util.List;

public class ProjDetailInfo {
		private String projName;
		private List<Projdes> projDesList;
		private String priceDes;
		private String priceFileName;
		private String detailDes;
		private String detailFileName;
		
		
		public String getProjName() {
			return projName;
		}
		public void setProjName(String projName) {
			this.projName = projName;
		}
		public List<Projdes> getProjDesList() {
			return projDesList;
		}
		public void setProjDesList(List<Projdes> projDesList) {
			this.projDesList = projDesList;
		}
		public String getPriceDes() {
			return priceDes;
		}
		public void setPriceDes(String priceDes) {
			this.priceDes = priceDes;
		}
		public String getPriceFileName() {
			return priceFileName;
		}
		public void setPriceFileName(String priceFileName) {
			this.priceFileName = priceFileName;
		}
		public String getDetailDes() {
			return detailDes;
		}
		public void setDetailDes(String detailDes) {
			this.detailDes = detailDes;
		}
		public String getDetailFileName() {
			return detailFileName;
		}
		public void setDetailFileName(String detailName) {
			this.detailFileName = detailName;
		}
		
		
}
