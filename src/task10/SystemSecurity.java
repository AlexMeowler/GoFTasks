package task10;

public class SystemSecurity extends DecoratorOptions {

    public SystemSecurity(AutoBase autoProperty, String title) {
	super(autoProperty, title);

	setName(autoProperty.getName() + ". Повышенной безопасности");
	setDescription(autoProperty.getDescription() + ". " + getTitle() + ". Передние боковые "
		+ "подушки безопасности, ESP - система динамической стабилизации автомобиля");
    }

    @Override
    public double getTotalCost() {
	return getAutoProperty().getTotalCost() + 20.99;
    }
}
