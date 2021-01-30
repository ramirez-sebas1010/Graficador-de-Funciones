
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.CategorySeries.CategorySeriesRenderStyle;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;

/**
 * Algoritmos y Estructura de datos 3 - Tarea Recuperatoria - Ejercicio 3
 * Integrantes: Matias Ramirez y Ruben Martinez
 * 
 * 
 */
public class App {

    public static void main(String[] args) {

        // Lista de los graficos a mostrar
        int numCharts = 11;
        List<CategoryChart> charts = new LinkedList<>();

        // Inicializamos el dominio de las funciones que sera de 0 a 500
        List<Integer> xValues = new LinkedList<>();
        for (int i = 0; i <= 500; i++) {
            xValues.add(i);
        }

        // Creamos una lista de los nombres de las funciones para mostrar
        List<String> nameFun = new LinkedList<>();
        addFunctionNames(nameFun);

        // Creamos una de las funciones a operar
        List<Function<Integer, BigDecimal>> f = new LinkedList<>();
        addFunctions(f);

        // Contador que nos indica que funcion y nombre a agregar
        int countFunc = 0;

        // Valores de rango de las dos funciones a compararse
        List<BigDecimal> yValues1;
        List<BigDecimal> yValues2;

        for (int i = 0; i < numCharts; i++) {
            yValues1 = xValues.stream().map(f.get(countFunc)).collect(Collectors.toList());
            yValues2 = xValues.stream().map(f.get(countFunc + 1)).collect(Collectors.toList());

            CategoryChart chart = createChart(xValues, yValues1, xValues, yValues2, nameFun.get(countFunc),
                    nameFun.get(countFunc + 1));
            charts.add(chart);
            countFunc += 2;
        }

        new SwingWrapper<>(charts).displayChartMatrix();

    }

    private static void addFunctionNames(List<String> nameFun) {
        nameFun.add("f(n) = n-100");
        nameFun.add("f(n) = n-200");
        nameFun.add("f(n) = n^(1/2)");
        nameFun.add("f(n) = n^(2/3)");
        nameFun.add("f(n) = 10*log(n)");
        nameFun.add("f(n) = 2*log(n)");
        nameFun.add("f(n) = log(n)^(log(n))");
        nameFun.add("f(n) =  n/log(n)");
        nameFun.add("f(n) = n^(1/2)");
        nameFun.add("f(n) = log(n)^3");
        nameFun.add("f(n) = n*(2^N)");
        nameFun.add("f(n) = (3^N)");
        nameFun.add("f(n) = n!");
        nameFun.add("f(n) = (n+1)!");
        nameFun.add("f(n) = n*log(n)");
        nameFun.add("f(n) = 10n*log(10n)");
        nameFun.add("f(n) = n^(1.01)");
        nameFun.add("f(n) = log(n)^10");
        nameFun.add("f(n) = n^(1/2)");
        nameFun.add("f(n) = 5^log(n)");
        nameFun.add("f(n) = (n^(1/2))/log(n)");
        nameFun.add("f(n) = 5^log(n)");
    }

    private static void addFunctions(List<Function<Integer, BigDecimal>> f) {
        f.add(Funcion.r1);
        f.add(Funcion.r2);

        f.add(Funcion.r3);
        f.add(Funcion.r4);

        f.add(Funcion.r5);
        f.add(Funcion.r6);

        f.add(Funcion.r7);
        f.add(Funcion.r8);

        f.add(Funcion.r9);
        f.add(Funcion.r10);

        f.add(Funcion.r11);
        f.add(Funcion.r12);

        f.add(Funcion.r13);
        f.add(Funcion.r14);

        f.add(Funcion.r15);
        f.add(Funcion.r16);

        f.add(Funcion.r17);
        f.add(Funcion.r8);

        f.add(Funcion.r19);
        f.add(Funcion.r20);

        f.add(Funcion.r21);
        f.add(Funcion.r22);
    }

    private static CategoryChart createChart(List<Integer> xValues, List<BigDecimal> yValues1, List<Integer> xValues2,
            List<BigDecimal> yValues2, String string, String string2) {
        CategoryChart chart = new CategoryChartBuilder().width(900).height(700).title("f(n) vs g(n)").xAxisTitle("N")
                .yAxisTitle("T(n)").build();

        // Customize Chart
        chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
        chart.getStyler().setChartTitleVisible(true);
        chart.getStyler().setXAxisTicksVisible(false);
        chart.getStyler().setYAxisMin(0.0);
        chart.getStyler().setDefaultSeriesRenderStyle(CategorySeriesRenderStyle.Line);
        chart.addSeries(string, xValues, yValues1);
        chart.addSeries(string2, xValues2, yValues2);
        return chart;
    }
}