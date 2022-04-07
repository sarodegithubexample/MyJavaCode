package com.test;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.transaction.Transaction;

@Entity
@Table(name="transactions")
public class Transection {
  
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		
		private int id;
	 
	  @Column(name = "date")
		private Date date;

		@Column(name = "total")
		private int total;
        public int getId() {
			return id;
		}

		
		public void setId(int id) {
			this.id = id;
		}

		
		public Date getDate() {
			return date;
		}

		
		public void setDate(Date date) {
			this.date = date;
		}

		
		public int getTotal() {
			return total;
		}

		
		public void setTotal(int total) {
			this.total = total;
		}
		
		

}
