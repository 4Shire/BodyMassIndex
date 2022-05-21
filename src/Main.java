import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.calculate(180, 90);

        DecimalFormat df = new DecimalFormat("##.#");  // Жаль на лекции этой темы не было, интересно было разобраться)
        System.out.println(("Индекс массы тела ") + (df.format(bmi)) + (" кг/м²"));

    }
}
