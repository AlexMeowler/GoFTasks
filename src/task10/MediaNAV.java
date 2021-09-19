package task10;

public class MediaNAV extends DecoratorOptions {

    public MediaNAV(AutoBase autoProperty, String title) {
	super(autoProperty, title);

	setName(autoProperty.getName() + ". Современный");
	setDescription(autoProperty.getDescription() + ". " + getTitle() + ". Обновленная мультимедийная навигационная система");
    }

    @Override
    public double getTotalCost() {
	return getAutoProperty().getTotalCost() + 15.99;
    }

}
