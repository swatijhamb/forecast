import java.io.IOException;


import org.junit.jupiter.api.Test;



class AppTest {

    @Test
    void testApp() {
    	String[] ar = {"Dubai", "London"};
    	try {
			App.main(ar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // test code here
//    	ForecastService fs = new ForecastStub();
//    	ForecastServiceImpl f = new ForecastServiceImpl(fs);
//    	f.getForecast("Dubai", 2007-12-03);
    }

}