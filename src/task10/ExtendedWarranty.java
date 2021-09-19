package task10;

public class ExtendedWarranty extends DecoratorOptions {

    public ExtendedWarranty(AutoBase autoProperty, String title) {
  	super(autoProperty, title);

  	setName(autoProperty.getName() + ". Повышенной надежности");
  	setDescription(autoProperty.getDescription() + ". " + getTitle() + ". Расширенная гарантия");
      }

    @Override
    public double getTotalCost() {
	return getAutoProperty().getTotalCost() + 5.99;
    }

}
