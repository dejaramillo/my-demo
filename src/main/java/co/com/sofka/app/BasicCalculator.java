package co.com.sofka.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long subs(Long number1, Long number2) {
        logger.info( "Substrac {} + {}", number1, number2 );
        return number1 - number2;
    }
    public Long mul(Long number1, Long number2) {
        logger.info( "Multiplicating {} + {}", number1, number2 );
        return number1 * number2;
    }
    public Double div(Double number1, Double number2) {
        logger.info( "Division {} + {}", number1, number2 );
        try {
            return number1 / number2;
        }catch (Exception e){
            return null;
        }
    }
}
