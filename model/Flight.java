package com.example.flight.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class Flight {
	@Id
	int fid;
	int aid;
	Date dtime;
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public Date getDtime() {
		return dtime;
	}

	public void setDtime(Date dtime) {
		this.dtime = dtime;
	}

	public Date getAtime() {
		return atime;
	}

	public void setAtime(Date atime) {
		this.atime = atime;
	}

	Date atime;
    Flight() {
		
	}
	
	public Flight(int fid, int aid, Date dtime, Date atime) {
		super();
		this.fid = fid;
		this.aid = aid;
		this.dtime = dtime;
		this.atime = atime;
	}

	@Override
	public String toString() {
		return "flight [fid=" + fid + ", dtime="+dtime+", atime=" + atime + 
				"]";
	}

	
	

}


