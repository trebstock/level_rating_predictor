package dk.itu.mario.engine;
import org.pmml4s.model.Model;

public class HelloPMML

{

    private final Model model = Model.fromFile("/media/teresa/A22E95862E9553DF/Users/teres/Internship/pythonProject3/pythonProject3/model.pmml");


    public static void main(String[] args) {
        new HelloPMML().test(); // Need an instance of HelloWorld to call test on.
    }

    public void test() { //<-- not a static method.
        double[] values = new double[1519];
        System.out.println("Hello, Worldw");
        System.out.println(model.predict(values)[0]);
    }
}

