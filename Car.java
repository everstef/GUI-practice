package Question3;
//stefan evers c17707801
public class Car {
    
    public String getCarMake() {
		return CarMake;
	}
	public void setCarMake(String carMake) {
		CarMake = carMake;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public String getReg() {
		return Reg;
	}
	public void setRegistrationYear(String registrationYear) {
		Reg = registrationYear;
	}
	private String CarMake;
    private String CarModel;
    private String Reg;
    
   
}