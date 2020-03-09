
public class Driver {
    public static void main(String[] args) {
        //Let's test our discriminant
        Quadratic equation = new Quadratic(0.0, 3.0, 4.0);
        //Print object
        System.out.println(equation);
        //Compute whether equation has solution
        System.out.println(equation.hasRealRoots());
        //Compute roots
        System.out.println(equation.computeRoot1() + " , " + equation.computeRoot2());
        //Compute whether discriminant is negative
        System.out.println(equation.negDiscriminant());
        //Compute discriminant
        System.out.println(equation.discriminant());
        //Compute first derivative
        System.out.println(equation.firstDerivative(0));
    }
}
