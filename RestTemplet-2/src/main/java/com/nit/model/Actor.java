package com.nit.model;

public class Actor {

	private Integer actorId;
	private String actorName;
	private String actorAddre;
	private double remuneration;
	
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActorAddre() {
		return actorAddre;
	}
	public void setActorAddre(String actorAddre) {
		this.actorAddre = actorAddre;
	}
	public double getRemuneration() {
		return remuneration;
	}
	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", actorAddre=" + actorAddre
				+ ", remuneration=" + remuneration + "]";
	}
		
}
