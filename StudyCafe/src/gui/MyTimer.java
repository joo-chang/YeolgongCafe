package gui;

public class MyTimer {
	MyTime time;
	javax.swing.Timer timer;

	MyTimer(int hour, int min) {
		time = new MyTime(hour, min);

		start();
	}

	String getTime() {
		return time.toString();
	}

	void start() {
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(10000); // 1min동안 수행을 멈춘다.
					} catch (Exception e) {
					}
					System.out.println(time);
					decMinute();
				}
			}
		});

		th.start();

	}

	// 시간을 감소시키는 함수
	void decHour() {
		if (time.getHour() > 0) {
			time.setHour(time.getHour() - 1);
			time.setMinute(59);
		} else {
			stop();
		}

	}

	// 분을 감소시키는 함수
	void decMinute() {
		if (time.getMinute() > 0) {
			time.setMinute(time.getMinute() - 1);
		} else {
			// 분이 0이라서 감소시킬수 없다면 시간을 감소시킨다.
			decHour();
		}
	}

	void reset() {
		// time = new MyTime();
		time.setHour(0);
		time.setMinute(0);
	}

	void stop() {
		System.out.println("Time out");
		System.exit(0);
	}
}

class MyTime {
	int hour = 0;
	int minute = 0;

	MyTime() {
		this(0, 0);
	}

	MyTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;

	}

	int getHour() {
		return hour;
	}

	int getMinute() {
		return minute;
	}

	void setHour(int hour) {
		if (hour >= 0) {
			this.hour = hour;
		}
	}

	void setMinute(int minute) {
		if (minute >= 0 || minute < 60) {
			this.minute = minute;
		}
	}

	public String toString() {
		String tmp = "";
		tmp += (hour < 10) ? "0" + hour : "" + hour;
		tmp += ":";
		tmp += (minute < 10) ? "0" + minute : "" + minute;

		return tmp;
	}
}