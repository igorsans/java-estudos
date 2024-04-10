package segunda.temporada.episodioQuatro;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    double celcius;
    double fahrenheit;

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return (celcius * 9/5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (fahrenheit - 32) * 5/9;
    }
}
