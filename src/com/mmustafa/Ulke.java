package com.mmustafa;

public class Ulke {
	
	private String ulkeCode;
	
	public String getUlkeCode() {
		return ulkeCode;
	}
	
	public void setUlkeCode(String ulkeCode) {
		this.ulkeCode = ulkeCode;
	}
	
	public class Il {
		private String ildAdi;
		
		public String getIldAdi() {
			return ildAdi;
		}
		
		public void setIldAdi(String ildAdi) {
			this.ildAdi = ildAdi;
		}
		
		public class Ilce {
			private String ilcedAdi;
			
			public String getIlcedAdi() {
				return ilcedAdi;
			}
			
			public void setIlcedAdi(String ilcedAdi) {
				this.ilcedAdi = ilcedAdi;
			}
			
			public class Mahalle {
				private String mahdAdi;
				
				public String getMahdAdi() {
					return mahdAdi;
				}
				
				public void setMahdAdi(String mahdAdi) {
					this.mahdAdi = mahdAdi;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Ulke ulke = new Ulke();
		ulke.setUlkeCode("TR");
		
		Ulke.Il il = new Ulke().new Il();
		il.setIldAdi("Kilis");
		
		Ulke.Il.Ilce ilce = new Ulke().new Il().new Ilce();
		ilce.setIlcedAdi("Merkez");
		
		Ulke.Il.Ilce.Mahalle mahalle = new Ulke().new Il().new Ilce().new Mahalle();
		mahalle.setMahdAdi("Üniversite");
		System.out.println("Ülke: " + ulke.getUlkeCode() + " İl : " + il.getIldAdi() + " ilçe :" + ilce.getIlcedAdi()
				+ " Mah: " + mahalle.getMahdAdi());
	}
}
