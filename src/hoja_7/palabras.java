package hoja_7;

public class palabras {

	private String english;
	private String spanish;
	private String french;
	
	/**
	 * 
	 * @param english
	 * @param spanish
	 * @param french
	 */
	public palabras(String english, String spanish, String french) {
		
		this.english = english;
		this.spanish = spanish;
		this.french = french;
		
	}

	/**
	 * 
	 * @return
	 */
	public String getEnglish() {
		return english;
	}

	/**
	 * 
	 * @param english
	 */
	public void setEnglish(String english) {
		this.english = english;
	}

	/**
	 * 
	 * @return
	 */
	public String getSpanish() {
		return spanish;
	}

	/**
	 * 
	 * @param spanish
	 */
	public void setSpanish(String spanish) {
		this.spanish = spanish;
	}

	/**
	 * 
	 * @return
	 */
	public String getFrench() {
		return french;
	}

	/**
	 * 
	 * @param french
	 */
	public void setFrench(String french) {
		this.french = french;
	}
}
