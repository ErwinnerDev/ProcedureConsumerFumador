package com.erwinner.consumer.model;

public class Cigarro {
	private Integer papel;
	private Integer fosforo;
	private Integer tabaco;
	
	
	public Cigarro(Integer papel, Integer fosforo, Integer tabaco) {
		super();
		this.papel = papel;
		this.fosforo = fosforo;
		this.tabaco = tabaco;
	}


	public Integer getPapel() {
		return papel;
	}


	public void setPapel(Integer papel) {
		this.papel = papel;
	}


	public Integer getFosforo() {
		return fosforo;
	}


	public void setFosforo(Integer fosforo) {
		this.fosforo = fosforo;
	}


	public Integer getTabaco() {
		return tabaco;
	}


	public void setTabaco(Integer tabaco) {
		this.tabaco = tabaco;
	}


	@Override
	public String toString() {
		return "[ papel:"+papel+", fosforo:"+fosforo+", tabaco:"+tabaco+" ]";
	}
	
	
	
	
	
}
