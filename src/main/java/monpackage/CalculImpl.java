package monpackage;

import org.ext.OperationsMathematiques;

/**
 * @author Sébastien Choplin <sebastien.choplin@webadvise.fr>
 */
public class CalculImpl implements OperationsMathematiques {
    @Override
    public double addition(double v, double v1) {
        return v+v1;
    }

    @Override
    public double soustraction(double v, double v1) {
        return 0;
    }
}
