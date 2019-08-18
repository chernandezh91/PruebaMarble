package co.com.proyectobase.screenplay.util;

import static co.com.proyectobase.screenplay.util.UtilityTime.successfulCondition;

import java.util.concurrent.TimeUnit;

import org.awaitility.Awaitility;

public class WaitSeconds {

		public void waitThreeSeconds() {
			try {
				Awaitility.await().forever().pollInterval(2000, TimeUnit.MILLISECONDS).until(successfulCondition());
			} catch (Exception e) {
				e.getMessage();
			}
		}

}
