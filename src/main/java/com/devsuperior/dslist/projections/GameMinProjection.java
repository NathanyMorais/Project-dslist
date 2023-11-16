package com.devsuperior.dslist.projections;

public interface GameMinProjection {
	
	//métodos Gets correspondentes a minha consulta no banco de dados (feita no GameRepository através)
	
	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
}
