package task7;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Microwave {
    
    private Drive drive;
    private Notification notification;
    private Power power;
    
    public void defrost() {
	notification.startNotification();
	power.changePower(1000);
	drive.turlRight();
	drive.turlRight();
	power.changePower(500);
	drive.stop();
	drive.turlLeft();
	drive.turlLeft();
	power.changePower(200);
	drive.stop();
	drive.turlRight();
	drive.turlRight();
	drive.stop();
	power.changePower(0);
	notification.endNotification();
    }
    
    public void bakePie() {
	notification.startNotification();
	power.changePower(1500);
	drive.turlRight();
	drive.turlRight();
	drive.turlRight();
	drive.turlRight();
	drive.stop();
	drive.turlLeft();
	drive.turlLeft();
	drive.turlLeft();
	drive.turlLeft();
	drive.stop();
	power.changePower(0);
	notification.endNotification();
    }
}
