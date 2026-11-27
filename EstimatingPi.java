public class EstimatingPi {
    public static void main(String[] args) {
		Fraction MILU = new Fraction(355, 113);
		final double EPSILON = Math.abs(Math.PI - MILU.toDouble());
		Fraction estimate = new Fraction(3, 1);
		while (Math.abs(Math.PI - estimate.toDouble())>EPSILON){
			if (estimate.toDouble()<MILU.toDouble()){
				estimate.setNumerator(estimate.getNumerator()+1);
			}
			if (estimate.toDouble()>MILU.toDouble()){
				estimate.setDenominator(estimate.getDenominator()+1);
			}if (estimate.toDouble()==MILU.toDouble()){
				estimate.setNumerator(estimate.getNumerator()+1);
			}
}System.out.println(estimate);
}
}
