public class Secant {

    private double calculateFunction(double x) {
        //write here your equation for example down there equation is f(x) = e^x - 3x;
        return Math.pow(Math.E, x) - 3.0 * x;
    }


    public void calculateSecant() {
        //oldXValue is iteration starting x value 
        //firstXValue is iteration first x value
        //td is tolerance value
        //oldYValue is value from calculating calculateFunction with oldXValue
        //yValue is value from calculating calculateFunction with firstXValue
        DecimalFormat frm = new DecimalFormat("#.#####");
        double firstXValue = 1, oldXValue = 0, secondXValue;
        double td = 0.001;
        double oldYValue, yValue;

        int i = 2;
        System.out.println(0 + ".iteration x :" + frm.format(oldXValue));
        System.out.println(1 + ".iteration x :" + frm.format(firstXValue));
        while (true) {
            oldYValue = calculateFunction(oldXValue);
            yValue = calculateFunction(firstXValue);
            secondXValue = firstXValue - (yValue * (oldXValue - firstXValue)) / (oldYValue - yValue);
            System.out.print(i + ".iteration x : " + frm.format(secondXValue));
            System.out.println("\t" + "Delta X : " + frm.format(secondXValue - firstXValue));
            if (Math.abs((secondXValue - firstXValue)) < td) {
                System.out.println("Searching Value : " + frm.format(secondXValue));
                break;
            }
            i++;
            oldXValue = firstXValue;
            firstXValue = secondXValue;

        }
    }
}
