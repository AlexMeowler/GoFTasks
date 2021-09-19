package task10;

public class AntiTheft extends DecoratorOptions {

    public AntiTheft(AutoBase autoProperty, String title) {
	super(autoProperty, title);

	setName(autoProperty.getName() + ". Ваш и только Ваш");
	setDescription(autoProperty.getDescription() + ". " + getTitle() + ". улучшенная система защиты от угона");
    }

    @Override
    public double getTotalCost() {
	return getAutoProperty().getTotalCost() + 10.99;
    }

}
