import static java.lang.Math.sqrt;
import static java.lang.Math.cbrt;
public class Calculator {

    private double memory = 0;

    public double add(double myDouble) {
    this.memory = this.memory + myDouble;
    return this.memory;
    }
    public double subtract(double myDouble) {
        this.memory = this.memory - myDouble;
        return this.memory;
    }
    public double multiply(double myDouble) {
        this.memory = this.memory * myDouble;
        return this.memory;
    }
    public double divide(double myDouble) {
        this.memory = this.memory / myDouble;
        return this.memory;
    }
    public void clear(){
        this.memory = 0;
    }
     public double mysteryFunction(double myDouble) {
        this.memory = this.memory * myDouble * myDouble;
    return this.memory;
    }public double mysteryFunction2(double myDouble) {
        this.memory = this.memory / myDouble / 4;
        return this.memory;
    }public double mysteryFunction3(double myDouble) {
        this.memory = this.memory + myDouble * myDouble;
        return this.memory;
    }public double mysteryFunction4(double myDouble) {
        this.memory = this.memory * sqrt(myDouble);
        return this.memory;
    }public double mysteryFunction5(double myDouble) {
        this.memory = this.memory * cbrt(myDouble) / 3;
        return this.memory;
    }
}

