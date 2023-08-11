package stepDef_tripo;

import org.testng.annotations.Test;

import common_Pages_tripo.base_pages;

public class cucm_BaseClass {
	@Test
	public static void driver_Call() 
	{
		base_pages.openUrl();
	}
	
	@Test
	public static void driver_close()
	{
		base_pages.DriverClose();
	}

}
