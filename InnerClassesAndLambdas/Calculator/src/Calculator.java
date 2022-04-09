public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= /* TODO */
//Use a lambda expression to set "res" to the correct function.
                ((obj1, obj2) -> obj1 + obj2);
                break;
            case "-": res = ((obj1, obj2) -> obj1 - obj2);/* TODO */
//Use a lambda expression to set "res" to the correct function.-x2;
                break;
            case "*":/* TODO */
//Use a lambda expression to set "res" to the correct function.->x1*x2;
                res = ((obj1, obj2) -> obj1 * obj2);
                break;
            case "/":
                //Use a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.INITY:x1/x2;
                res = ((obj1, obj2) -> {
                    if (obj2 == 0)  return Double.POSITIVE_INFINITY;
                    return obj1 / obj2;
                });
            /*cas/* TODO */
/*Use a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.INITY:x1/x2;*/
                break;
            default:
          /* TODO */
//In the default value, the res function should return the minimun possible value.ouble.MIN_VALUE;
            return ((obj1, obj2) -> Double.MIN_VALUE);
        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
      /* TODO */
/*set calc to the correct function calling the method above.*/DoMath calc = toOperation(op);/* TODO */
//return the result of calc.compute with the numbers given..compute(n1,n2);
        return calc.compute(n1, n2);
    }
}
