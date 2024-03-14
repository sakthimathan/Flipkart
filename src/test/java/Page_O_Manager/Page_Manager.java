package Page_O_Manager;

import Page_Object_Model.ATC_Page;
import Page_Object_Model.CO_Page;

public class Page_Manager {
private ATC_Page ATc_Page;
private CO_Page Co_Page;




public CO_Page getCo_Page() {
	return (Co_Page==null)? Co_Page = new CO_Page():Co_Page;
}




public ATC_Page getATc_Page() {
	return (ATc_Page == null) ? ATc_Page = new ATC_Page():ATc_Page;
}
	
	
	
}
