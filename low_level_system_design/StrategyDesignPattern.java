package low_level_system_design;
import java.util.Scanner;
// Example of Strategy Design Pattern
interface Calculator		// Strategy interface
{
	double operation(double num1,double num2);
}
class Addition implements Calculator
{
	@Override
	public double operation(double num1,double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
}
class Subtraction implements Calculator
{
	@Override
	public double operation(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
}
class Multiplication implements Calculator
{
	@Override
	public double operation(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}
}
class Division implements Calculator
{
	@Override
	public double operation(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
}
class Strategy			// Context Class
{
	private Calculator calc;
	Strategy(Calculator calc)
	{
		this.calc = calc;
	}
	public double executeStrategy(double num1,double num2)
	{
		return calc.operation(num1, num2);
	}
}
public class StrategyDesignPattern {		// Concrete Strategy Class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		System.out.print("Enter 2 nos for Calculation - ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		Strategy str = new Strategy(new Addition());	// Addition sub class object
		System.out.println("Operation Addition - ");
		System.out.println(num1+" + "+num2+" = "+str.executeStrategy(num1, num2));
		str = new Strategy(new Subtraction());		// Subtraction sub class object
		System.out.println("Operation Subtraction - ");
		System.out.println(num1+" - "+num2+" = "+str.executeStrategy(num1, num2));
		str = new Strategy(new Multiplication());	// Multiplication sub class object
		System.out.println("Operation Multiplication - ");
		System.out.println(num1+" x "+num2+" = "+str.executeStrategy(num1, num2));
		str = new Strategy(new Division());			// Division sub class object
		System.out.println("Operation Division - ");
		System.out.println(num1+" / "+num2+" = "+str.executeStrategy(num1, num2));
	}

}
