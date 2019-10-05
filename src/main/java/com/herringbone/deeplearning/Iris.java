package com.herringbone.deeplearning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Iris {

    private Double sepalLength;
    private Double sepalWidth;
    private Double petalLength;
    private Double petalWidth;

    private String irisClass;

    public Iris(Double sl, Double sw, Double pl, Double pw) {
        sepalLength = sl;
        sepalWidth = sw;
        petalLength = pl;
        petalWidth = pw;
    }

    @Override
    public String toString() {
        return String.format(
                "Iris Class = %s, Data[ Sepal Length = %.1f, Sepal Width = %.1f, Petal Length = %.1f, Petal Width = %.1f ]",
                irisClass, sepalLength, sepalWidth, petalLength, petalWidth);
    }

}
