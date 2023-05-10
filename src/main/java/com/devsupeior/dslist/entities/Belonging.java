package com.devsupeior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_belonging")
public class Belonging {
	

	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer postion;
	
	public Belonging() {
		
	}

	public Belonging(Game game,GameList gameList, Integer postion) {
		id.setGame(game);
		id.setGameList(gameList);
		this.postion = postion;
	}

	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPostion() {
		return postion;
	}

	public void setPostion(Integer postion) {
		this.postion = postion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
