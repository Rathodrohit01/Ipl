package com.sep.entity;

public class Player {
	
	
	private int jercyno;
	private String name;
	private int run;
	private int weicket;
	private String teamname ;
	public Player() {
		super();
		
	}
	public Player(int jercyno, String name ,int run,int weicket,String teamname ) {
		super();
		this.jercyno = jercyno;
		this .name = name ;
		this.run = run ;
		this .weicket = weicket;
		this .teamname = teamname;
	}
	public int getJercyno() {
		return jercyno;
	}
	public void setJercyno(int jercyno) {
		this.jercyno = jercyno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getWeicket() {
		return weicket;
	}
	public void setWeicket(int weicket) {
		this.weicket = weicket;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", teamname=" + teamname + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
