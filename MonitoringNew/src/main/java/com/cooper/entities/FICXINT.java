package com.cooper.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="FICXINT")
public class FICXINT  implements Serializable{

	    
	    @Column(name="FLAXFIC")
	    private String FLAXFIC;
	   
	    @Column(name="SEQXFIC")
	    private int SEQXFIC;
	   
	    @Column(name="NOMXFIC")
	    private String NOMXFIC;
	   
	    @Column(name="DEPXFIC")
	    private String DEPXFIC;
	   
	    @Column(name="INTXFIC")
	    private String INTXFIC;
	   
	    @Column(name="DATXFIC")
	    private Timestamp DATXFIC;
	    
	    @Id
	    //@GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="NLIXFIC")
	    private int NLIXFIC;
	 
	    @Column(name="LIGXFIC")
	    private String LIGXFIC;

		public FICXINT() {
			super();
			// TODO Auto-generated constructor stub
		}

		public FICXINT(int nLIXFIC, String fLAXFIC, int sEQXFIC, String nOMXFIC, String dEPXFIC, String iNTXFIC,
				Timestamp dATXFIC, String lIGXFIC) {
			super();
			NLIXFIC = nLIXFIC;
			FLAXFIC = fLAXFIC;
			SEQXFIC = sEQXFIC;
			NOMXFIC = nOMXFIC;
			DEPXFIC = dEPXFIC;
			INTXFIC = iNTXFIC;
			DATXFIC = dATXFIC;
			LIGXFIC = lIGXFIC;
		}

		public int getNLIXFIC() {
			return NLIXFIC;
		}

		public void setNLIXFIC(int nLIXFIC) {
			NLIXFIC = nLIXFIC;
		}

		public String getFLAXFIC() {
			return FLAXFIC;
		}

		public void setFLAXFIC(String fLAXFIC) {
			FLAXFIC = fLAXFIC;
		}

		public int getSEQXFIC() {
			return SEQXFIC;
		}

		public void setSEQXFIC(int sEQXFIC) {
			SEQXFIC = sEQXFIC;
		}

		public String getNOMXFIC() {
			return NOMXFIC;
		}

		public void setNOMXFIC(String nOMXFIC) {
			NOMXFIC = nOMXFIC;
		}

		public String getDEPXFIC() {
			return DEPXFIC;
		}

		public void setDEPXFIC(String dEPXFIC) {
			DEPXFIC = dEPXFIC;
		}

		public String getINTXFIC() {
			return INTXFIC;
		}

		public void setINTXFIC(String iNTXFIC) {
			INTXFIC = iNTXFIC;
		}

		public Timestamp getDATXFIC() {
			return DATXFIC;
		}

		public void setDATXFIC(Timestamp dATXFIC) {
			DATXFIC = dATXFIC;
		}

		public String getLIGXFIC() {
			return LIGXFIC;
		}

		public void setLIGXFIC(String lIGXFIC) {
			LIGXFIC = lIGXFIC;
		}

		@Override
		public String toString() {
			return "FICXINT [NLIXFIC=" + NLIXFIC + ", FLAXFIC=" + FLAXFIC + ", SEQXFIC=" + SEQXFIC + ", NOMXFIC="
					+ NOMXFIC + ", DEPXFIC=" + DEPXFIC + ", INTXFIC=" + INTXFIC + ", DATXFIC=" + DATXFIC + ", LIGXFIC="
					+ LIGXFIC + "]";
		}
	    
 
}
