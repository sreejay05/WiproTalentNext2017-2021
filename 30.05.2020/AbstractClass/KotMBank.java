public class KotMBank extends GeneralBank {

	@Override
	public double getSavingInterestRate() {
		return 0.06;
	}

	@Override
	public double getFixedInterestRate() {
		return 0.90;
	}

}
