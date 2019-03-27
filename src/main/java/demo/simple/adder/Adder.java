package demo.simple.adder;
/**
 * @author Yuan-Fang Li & Yan Liu
 * @version $Id: 02$
 */
public class Adder {

    public int add(String argument) {

        if(null == argument)
            throw new IllegalArgumentException("Null input.");
        String[] parts = argument.split(",");
        int sum = 0;
        for (String s : parts) {
            if (!s.trim().isEmpty()) {
                int partInt = Integer.parseInt(s.trim());
                if(partInt < 0)
                    throw new IllegalArgumentException("Negative Integer");
                sum += partInt;
            }
        }

        return sum;
    }
}
