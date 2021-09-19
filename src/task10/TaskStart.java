package task10;

public class TaskStart {

    public static void main(String[] args) {
	Renault reno = new Renault("Рено", "Renault LOGAN Active", 499.0);
	AutoBase secureNavReno = new SystemSecurity (new MediaNAV(reno, "Навигация"), "Безопасность");
	print(secureNavReno);
	Audi audi = new Audi("Ауди", "Audi Q5 Sportback", 399);
	AutoBase modifiedAudi = new ExtendedWarranty(new AntiTheft(audi, "Антиугон"), "Гарантия");
	print(modifiedAudi);
    }

    private static void print(AutoBase av) {
	System.out.println(av.toString());
    }

}
