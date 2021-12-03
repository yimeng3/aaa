package cn.com.manager.agm.dao;

import java.util.List;

import cn.com.manager.agm.po.Area;

public interface InfAreaDao 
{
	
	public List checkAddArea(Area area);
	
	public int addArea(Area area);
	
	public Area updateFindArea(Area area);
	
	public int updateArea(Area area);
	
	public List deleteFindArea();
	
	public int deleteArea(Area area);
	
	
}
